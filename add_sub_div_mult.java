import java.util.Scanner;
public class add_sub_div_mult
{
  public static void main(String args[])
{
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input your first number: ");
  int num1 = in.nextInt();
   
  System.out.print("Input your second number: ");
  int num2 = in.nextInt();
   
 
  System.out.println("addition of two numbers : "+(num1 + num2));
   
  System.out.println("subtraction of two numbers : "+(num1 - num2));
   
  System.out.println("multiplication of two numbers : " + (num1 * num2));
   
  System.out.println("division of two numbers : "+ (num1 / num2));
 }
 
}
