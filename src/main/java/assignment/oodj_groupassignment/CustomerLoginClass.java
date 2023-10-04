package assignment.oodj_groupassignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// child class of ManagerLoginClass
public class CustomerLoginClass extends ManagerLoginClass{
    CustomerLoginClass(String ID, String pass) {
        super(ID, pass);
    }

    //method overriding of login method from ManagerLoginClass
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
                    token = data;
                    break;
                }
            }
            reader.close();
            account.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please contact admin to recover the account file.");
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
}
