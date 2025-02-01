package Task_1st_Feb;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Website_Domain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your website URL");
        String websiteURL = sc.next();

        //Remember this String is the name of the Java String class. You can't call methods directly on the class itself.
        // You need to call methods on a string object.  In your case, the string object is websiteURL.
        if (websiteURL.contains(".com")){
            System.out.println("The website type is: Commercial website");
        }
        else if (websiteURL.contains(".edu")) {
            System.out.println("The website type is: Educational institution");
        }
        else if (websiteURL.contains(".gov")) {
            System.out.println("The website type is: Government website");
        }
        else if (websiteURL.contains(".net")) {
            System.out.println("The website type is: Informational website");
        }
        else if (websiteURL.contains(".info")) {
            System.out.println("The website type is: NUnknown or other types of websites");
        }
        else if (websiteURL.contains(".xyz")) {
            System.out.println("The website type is: Non-profit organization");
        }
    }
}
