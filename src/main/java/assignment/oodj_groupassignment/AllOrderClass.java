// Author: TP064047 Wong Jun Zhi

package assignment.oodj_groupassignment;
import java.io.*;
import java.util.*;

public class AllOrderClass {
    // Declare static variable to save data and accessible across all the functions within this class
    static ArrayList<String> data;
    static List<Integer> n = new ArrayList<Integer>();

    // Reads the food record from the file and stores it into [data] variable, no input needed
    void readOrder()
    {
        try {
            FileReader foodMenu = new FileReader("Order.txt");
            ArrayList<String> temp = new ArrayList<String>();
            ArrayList<String> temp2 = new ArrayList<String>();

            Scanner reader = new Scanner(foodMenu);
            int n = 1;
            while (reader.hasNextLine()) {
                String tempStorage = reader.nextLine();

                if (tempStorage.equals(""))
                {
                    String[] stringArray = temp.toArray(new String[0]);
                    StringBuffer sb = new StringBuffer();
                    // loop through the data and replace the empty space with desired characters as bookmarks
                    // this helps with processing and referencing the data in other functions
                    for(int j = 0; j < stringArray.length; j++) {
                        if (j != stringArray.length - 1) {
                            if (n < 2) {
                                sb.append(stringArray[j] + "!");
                                n++;
                            }
                            else
                                sb.append(stringArray[j] + "@");
                        }
                        else {
                            sb.append(stringArray[j]);
                            n = 1;
                        }
                    }
                    String s = sb.toString();
                    temp2.add(s);
                    temp.removeAll(temp);
                }
                else temp.add(tempStorage);
            }
            // clone the read data into the static variable
            data = (ArrayList<String>)temp2.clone();
            reader.close();
            foodMenu.close();
        } catch (FileNotFoundException e) {
            System.out.println("Order record file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File corrupted. Please contact admin to recover the order record file.");
            e.printStackTrace();
        }
    }

    // method that loops through the list of order details and checks for any record that matches input,
    // input argument consist of the order details from user to search
    // method overload
    List<Integer> checkOrder(String[] searchStr1, String[] searchStr2)
    {
        int ctr = 0, found;
        if (n != null)
            n.removeAll(n);
        for (int i = 0; i < data.size(); i++) {
            found = 0;
            // splitting the string with the help of characters placed in the string from previous method
            String tempStorage = data.get(i);
            String[] temp = tempStorage.split("!");
            String[] orderDetails = temp[0].split(" ");
            String[] orderFood = temp[1].split("@");
            for (int j = 0; j < searchStr1.length; j++)
            {
                if(searchStr1[j].isEmpty())
                    continue;
                // a switch case to handle the mapping of input search string to the data from file
                // elements of input string has index of 0 1 2 3 while the desired elements of data has index of 0 1 4 5
                switch (j)
                {
                    case 0:
                        if(orderDetails[j].contains(searchStr1[j])) {
                            n.add(i); found++; ctr++;
                            break;
                        }
                    case 1:
                        if(orderDetails[j].contains(searchStr1[j])) {
                            n.add(i); found++; ctr++;
                            break;
                        }
                    case 2:
                        if(orderDetails[j+2].contains(searchStr1[j])) {
                            n.add(i); found++; ctr++;
                            break;
                        }
                    case 3:
                        if(orderDetails[j+2].contains(searchStr1[j])) {
                            n.add(i); found++; ctr++;
                            break;
                        }
                }
                // breaks after finding matching record to prevent duplicating output
                if (found == 1)
                    break;
            }
            // breaks after finding matching record to prevent duplicating output
            if (found == 1)
                continue;
            for (int j = 0; j < orderFood.length; j++)
            {
                for (int k = 0; k < searchStr2.length; k++) {
                    if (searchStr2[k].isEmpty())
                        continue;
                    else if (orderFood[j].contains(searchStr2[k])) {
                        n.add(i);
                        ctr++;
                        break;
                    }
                }
            }
        }
        n.add(ctr);
        return n; // returns integer list to method call for further reference
    }

    // deletes the data at the location desired, input argument is the index of food record in the data variable
    void deleteOrder(int i)
    {
        data.remove(i);
    }

    // method to change completion status of a particular order
    void completeOrder(int i, int j)
    {
        String tempStorage = data.get(i);
        String[] temp = tempStorage.split("!");
        String[] orderDetails = temp[0].split(" ");
        // overwriting the record
        orderDetails[5] = "COMP" + j;
        StringBuffer sb = new StringBuffer();
        for(int a = 0; a < orderDetails.length; a++) {
            if (a == orderDetails.length - 1)
                sb.append(orderDetails[a] + "!");
            else sb.append(orderDetails[a] + " ");
        }
        String str = sb.toString();
        str = str + temp[1];
        data.set(i, str);
    }

    // method to count orders and output to function call
    // method overload
    List<Integer> checkOrder(String ID)
    {
        int ctr = 0;
        for (int i = 0; i < data.size(); i++) {
            String tempStorage = data.get(i);
            String[] temp = tempStorage.split("!");
            String[] orderContent = temp[1].split("@");
            for (int j = 0; j < orderContent.length; j++) {
                String[] orderFood = orderContent[j].split(" ");
                if (orderFood[1].equals(ID))
                    ctr++;
            }
        }
        if (n != null)
            n.removeAll(n);
        n.add(ctr);
        return n;
    }

    // function to overwrite the order record file with the updated order records
    void writeOrderFile()
    {
        // loop through all the elements and removing the bookmark inserted in the read method
        for(int i = 0; i < data.size(); i++)
        {
            String text = data.get(i);
            String text2, text3;
            text2 = text.replaceAll("!", "\n");
            text3 = text2.replaceAll("@", "\n");
            text3 = text3 + "\n";
            data.set(i, text3);
        }
        try {
            FileWriter writer = new FileWriter("Order.txt");
            for(String str: data) {
                writer.write(str + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
