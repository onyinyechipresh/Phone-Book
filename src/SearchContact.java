import java.util.Map;

public class SearchContact {
    //to search for contacts
    public static void searchContact() {
        System.out.println();
        System.out.print("press 1 to search by Name or 2 to search by Number: ");
        int option = Main.input.nextInt();
        while (true) {
            if(option == 1){
                byName();
                break;
            } else if (option == 2) {
                byNumber();
                break;
            }

        }
    }

    //to search by name
    public static void byName() {
        System.out.print("Enter the Name: ");
        String name = Main.input.next().toLowerCase();
        if(Main.contact.containsKey(name)){
            for(Map.Entry names: Main.contact.entrySet()){
                if(names.getKey().equals(name)){
                    System.out.println();
                    System.out.println("Name: " + names.getKey());
                    System.out.println("Name: " + names.getValue());
                }
            }
        }
        else{
            System.out.println("Contact not found!");
        }
    }

    //to search by number
    public static void byNumber() {
        System.out.print("Enter Phone Number: ");
        String number = Main.input.next().toLowerCase();
        if(Main.contact.containsValue(number)){
            for(Map.Entry numbers: Main.contact.entrySet()){
                if(numbers.getValue().equals(number)){
                    System.out.println();
                    System.out.println("Name: " + numbers.getKey());
                    System.out.println("Number: " + numbers.getValue());
                }
            }
        }
        else{
            System.out.println("Contact not found!");
        }
    }
}
