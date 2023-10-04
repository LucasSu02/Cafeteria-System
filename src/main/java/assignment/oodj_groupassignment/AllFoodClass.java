// Author: TP064047 Wong Jun Zhi

package assignment.oodj_groupassignment;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class AllFoodClass {
    // Declare static variable to save data and accessible across all the functions within this class
    static ArrayList<String> data;
    static List<Integer> n = new ArrayList<Integer>();
    String[] storage;

    // Constructor
    AllFoodClass(String[] inputStorage)
    {
        storage = inputStorage;
    }

    // Reads the food record from the file and stores it into [data] variable, no input needed
    void readFood()
    {
        try {
            FileReader foodMenu = new FileReader("FoodMenu.txt");
            ArrayList<String> temp = new ArrayList<String>();

            Scanner reader = new Scanner(foodMenu);
            while (reader.hasNextLine()) {
                String tempStorage = reader.nextLine();
                temp.add(tempStorage);
            }
            reader.close();
            foodMenu.close();
            // clone the read data into the static variable
            data = (ArrayList<String>)temp.clone();
        } catch (FileNotFoundException e) {
            System.out.println("Menu not found. ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File corrupted. Please contact admin to recover the menu file.");
            e.printStackTrace();
        }
    }

    // function that loops through the list of food details and checks for any record that matches input,
    // input argument consist of the food details from user to search
    List<Integer> checkFood(String[] searchStr, double price)
    {
        int ctr = 0;
        if (n != null)
            n.removeAll(n);
        for (int i = 0; i < data.size(); i++) {
            String tempStorage = data.get(i);
            String[] temp = tempStorage.split(" ");
            for (int j = 0; j < searchStr.length; j++)
            {
                if (j == searchStr.length - 1)
                {
                    // Checks if the data contains the input
                    if(temp[j].contains(String.valueOf(price)))
                    {
                        n.add(i); ctr++;
                        break;
                    }
                }
                else if(searchStr[j].isEmpty())
                    continue;
                else if(j == 0)
                {
                    if(temp[j].equals(searchStr[j])) {
                        n.add(i); ctr++;
                        break;
                    }
                }
                else if(temp[j].contains(searchStr[j])) {
                    n.add(i); ctr++;
                    break;
                }
            }
        }
        n.add(ctr);
        return n; // returns integer list to method call for further reference
    }

    // deletes the data at the location desired, input argument is the index of food record in the data variable
    void removeFood(int i)
    {
        data.remove(i);
    }

    // method to edit food's price, input argument takes user's input price
    void editFood(String[] editStr, int i)
    {
        StringBuffer sb = new StringBuffer();
        for(int j = 0; j < editStr.length; j++) {
            if (j == editStr.length - 1)
                sb.append(editStr[j]);
            else sb.append(editStr[j] + " ");
        }
        String tempStorage = sb.toString();
        data.set(i, tempStorage);
    }

    // function to add a food into the record, input argument is the food details and price
    void addFood(String[] addStr, double price)
    {
        String tempStorage = data.get(data.size() - 1);
        String[] temp = tempStorage.split(" ");
        // Generates a unique serial food ID for the new food
        String ID = String.format("%04d", Integer.parseInt(temp[0])+1);
        StringBuffer sb = new StringBuffer();
        for(int j = 0; j < addStr.length; j++) {
            sb.append(addStr[j] + " ");
        }
        String temp3 = ID + " " + sb.toString() + String.valueOf(price);
        // add the food details into the data variable to be written into file
        data.add(temp3);
    }

    // function to read the price of a specific food with input of food ID
    double readPrice(String ID)
    {
        double price = 0;
        for (int i = 0; i < data.size(); i++) {
            String tempStorage = data.get(i);
            String[] temp = tempStorage.split(" ");
            if (temp[0].equals(ID)) {
                price = Double.parseDouble(temp[4]);
                break;
            }
        }
        return price;
    }

    // function to overwrite the food menu file with the updated food record data
    void writeFoodFile()
    {
        try {
            FileWriter writer = new FileWriter("FoodMenu.txt");
            // enhanced for loop to simplify coding
            for(String str: data) {
                writer.write(str + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
