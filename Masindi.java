import java.util.Scanner;

public class Masindi {
    public static void main(String[] args) {
        
        Scanner keys = new Scanner(System.in);
        System.out.println("Please type in your 2 whole/Integer values:");
        
        int number1,number2, Answer;
         number1 = keys.nextInt();
         number2 = keys.nextInt();
         
         Answer = number2-number1;
         
         System.out.println("This is the difference between the numbers you typed in: " + Answer);
         keys.close();

    }
    
}
