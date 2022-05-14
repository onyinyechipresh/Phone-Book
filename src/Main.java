import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static HashMap<String, String> contact = new HashMap<String, String>();

    public static void main(String[] args) {
        //prompt the user to save or search contact
        System.out.println("Hey There! Welcome to my Phone Book");
        while(true) {
            System.out.println();
            System.out.print("Press 1 to add new contact or 2 to search for contact: ");
            int option = input.nextInt();
            if (option == 1) {
                AddContact.addContact();
                break;
            }
            else if(option ==2){
                SearchContact.searchContact();
                break;
            }
        }
    }

}