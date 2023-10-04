package assignment.oodj_groupassignment;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class ManagerLoginClass {
    // initialise data for constructors
    String userID, password;
    boolean login;

    // constructor for OOP concept
    ManagerLoginClass(String ID, String pass)
    {
        userID = ID;
        password = pass;
    }

    // method to authorise the user with account ID and password input
    String login()
    {
        String token = "guest";
        try {
            FileReader account = new FileReader("CustomerAccount.txt");
            int n;

            Scanner reader = new Scanner(account);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] accountInfo = data.split(" ");

                if (accountInfo[0].equals(userID) && accountInfo[2].equals(password)) {
                    token = accountInfo[0];
                    break;
                }
            }
            reader.close();
            account.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please contact admin to recover the account file.");
            // creates new files for the user, only runs at the initial execution of application
            try {
                FileWriter writer = new FileWriter("CustomerAccount.txt");
                writer.write("ADMIN1 MASTER_ADMIN iamadmin 10 ACCOUNT\n" + "CAA000 DEFAULT DEFAULT 10 ACCOUNT\n");
                writer.close();
                FileWriter writer2 = new FileWriter("FoodMenu.txt");
                writer2.write("0000 FoodName Cuisine Category 0");
                writer2.close();
                FileWriter writer3 = new FileWriter("Order.txt");
                writer3.write("CustomerID dd/MM/yyyy hh:mm:ss price feedback complete\n" +
                        "FOOD FoodID FoodName\n\n");
                writer3.close();
                FileWriter writer4 = new FileWriter("Feedbacks.txt");
                writer4.write("CustomerID dd/MM/yyyy hh:mm:ss FoodID FoodName Rating Comment\n");
                writer4.close();
                FileWriter writer5 = new FileWriter("LoginRecord.txt");
                writer5.write("");
                writer5.close();
            } catch (IOException f) {
                f.printStackTrace();
            }
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File corrupted. Please contact admin to recover the account file.");
            e.printStackTrace();
        }
        return token;
    }

    // encapsulation of a function under class that logs the successful login attempt of user
    public void loginLog()
    {
        try {
            ArrayList<String> data;
            FileReader loginRecord = new FileReader("LoginRecord.txt");
            ArrayList<String> temp = new ArrayList<String>();

            Scanner reader = new Scanner(loginRecord);
            while (reader.hasNextLine()) {
                String tempStorage = reader.nextLine();
                temp.add(tempStorage);
            }
            reader.close();
            loginRecord.close();
            data = (ArrayList<String>)temp.clone();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date longDate = new Date();
            //Generating date in simple format
            String date = formatter.format(longDate);
            data.add(userID + " " + date);

            FileWriter writer = new FileWriter("LoginRecord.txt");
            for(String str: data) {
                writer.write(str + "\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File corrupted. Please contact admin to recover the file.");
            e.printStackTrace();
        }
    }
}

