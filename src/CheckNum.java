public class CheckNum {
    //check if the user input number in the right format
    public static String checkNum() {
        String number;
        while(true){
            System.out.print("Number: ");
             number = Main.input.next();
            if(number.length() == 11 && number.matches("\\d+") && number.startsWith("0")){
                break;
            }
        }
        return number;
    }
}
