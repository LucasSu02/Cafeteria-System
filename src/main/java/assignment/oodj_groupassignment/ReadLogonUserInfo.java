package assignment.oodj_groupassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class ReadLogonUserInfo {
    String accountInfo;
    String readLogonInfo ()
    {
        try
        {
            //This is to read the infrmation of the logged on user
            //The main thing is his name and the balance
            BufferedReader logonUserInfo = new BufferedReader(new FileReader("LogonUserInfo.txt"));
            accountInfo = logonUserInfo.readLine();
            logonUserInfo.close();
            
        }
        catch (Exception e)
        {
            System.out.println("Error reading logon user info.");
        }
        return accountInfo;
    }
}
