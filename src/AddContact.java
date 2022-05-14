public class AddContact {
    //collects name and phone number from user
    public static void addContact() {
        System.out.println();
        System.out.println("Enter and and Phone number");
        System.out.println("Number must start with 0 and must be eleven digits!");
        System.out.print("Name: ");
        String name = Main.input.next().toLowerCase();
        String number = CheckNum.checkNum();
        System.out.println("Contact Saved");

        Main.contact.put(name, number);
        AddMore.addMore();

    }
}
