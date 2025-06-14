import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // PSEUDO CODE
        // Create Scanner
        // int month
        // String trash
        // Output: "What is your birthmonth(1-12)"
        //if valid input
        //  if month is between 1 and 12
        //      Output "Your birthmonth is" + x
        //  else
        //      Output "You entered an incorrect month values" + x
        //  else
        //      Output "Invalid Input: " + Trash
        // CODE

        Scanner in = new Scanner(System.in);
        int month;
        String trash = "";

        System.out.print("Enter you birth month (1-12): ");

        if(in.hasNextInt()){
            month = in.nextInt();
            in.nextLine();

            if (month >= 1 && month <= 12){
                System.out.println("Your birth month is: " + month);
            }
            else{
                System.out.println("You enter an incorrect month value: " + month);
            }
        }
        else{
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Enter values (1-12)");
        }

    }
}