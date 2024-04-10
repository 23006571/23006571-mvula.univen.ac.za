import java.util.Scanner;
import static java.lang.Math.pow;
public class StatisticsIn{
    
public static void main(String[]args){
    Scanner Jane =new Scanner(System.in);
    
    System.out.print("enter principle amount");
 double P=Jane.nextDouble();
 System.out.print("enter annual interest");
 double I=Jane.nextDouble();
 System.out.println("enter period");
 int N = Jane.nextByte();
 
 double A=P*Math.pow(1+I,N);
 System.out.println("the amount is"+A);
 
}

 

