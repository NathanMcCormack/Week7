package ie.atu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x=0;

        while(x<1){
            System.out.println("\nPlease enter a whole number between 0 - 9: ");
            Scanner myScan = new Scanner(System.in);
            try{
                //Read user input as a string
                String input = myScan.nextLine();

                //Parse the input to an integer
                int myNum = Integer.parseInt(input);

                //Check if the number is between 0 and 9
                if (myNum >= 0 && myNum <= 9){
                    System.out.println("You entered " + myNum);
                    x++; //increment x on a valid input to exit the loop
                }
                else{
                    System.out.println("Not a valid input");
                }
            }
            catch(NumberFormatException e){ //"catches" an error in the try section and runs this code
                System.out.println("Not a valid numeric value");
            }
        }
    }
}