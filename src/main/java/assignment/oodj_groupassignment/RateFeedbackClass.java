package assignment.oodj_groupassignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RateFeedbackClass {
    // initialise data storage
    static ArrayList<String> data;
    static List<Integer> n = new ArrayList<Integer>();

    // reads the feedbacks file and stores the data in the storage
    void readFeedback()
    {
        try {
            FileReader foodMenu = new FileReader("Feedbacks.txt");
            ArrayList<String> temp = new ArrayList<String>();

            Scanner reader = new Scanner(foodMenu);
            while (reader.hasNextLine()) {
                String tempStorage = reader.nextLine();
                temp.add(tempStorage);
            }
            reader.close();
            foodMenu.close();
            data = (ArrayList<String>)temp.clone();
        } catch (FileNotFoundException e) {
            System.out.println("Feedback record file not found. ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File corrupted. Please contact admin to recover the feedback file file.");
            e.printStackTrace();
        }
    }

    // loop through the data read from previous function and filter out the feedback for desired food
    List<Integer> checkFeedback(String foodID)
    {
        int ctr = 0;
        if (n != null)
            n.removeAll(n);
        for (int i = 0; i < data.size(); i++) {
            String tempStorage = data.get(i);
            String[] temp = tempStorage.split(" ");
            if (temp[3].equals(foodID))
                n.add(i); ctr++;
            System.out.println("test1");
        }
        n.add(ctr);
        return n;
    }
}
