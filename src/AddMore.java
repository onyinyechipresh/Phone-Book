public class AddMore {
    //to add more contact
    public static void addMore() {
        System.out.println();
        System.out.println("Select 1 to add more Contact");
        System.out.println("Select 2 to search contact");
        System.out.println("Select 3 to exit");
        System.out.print("Select: ");

        int select = Main.input.nextInt();
        if(select == 1){
            AddContact.addContact();
        }
        else if(select == 2){
            SearchContact.searchContact();
        }
        else{
            System.out.println("Good Bye!");
        }
    }
}
