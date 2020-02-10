package epam_dp;
import java.util.Scanner;
public class calculator
{
	public static void main(String[] args) {
	       Scanner reader = new Scanner(System.in);
	       System.out.print("Enter first numbers: ");
	       double first = reader.nextDouble();
	       System.out.print("Enter second numbers: ");
	       double second = reader.nextDouble();
	       System.out.print("Enter an operator (+, -, *, /): ");
	       char operator = reader.next().charAt(0);
	       double result;
	       switch(operator)
	       {
	           case '+':
	               result = first + second;
	               break;
	           case '-':
	               result = first - second;
	               break;
	           case '*':
	               result = first * second;
	               break;
	           case '/':
	               result = first / second;
	               break;
	           default:
	               System.out.print("Error! operator is not correct");
	               return;
	       }
	       System.out.print(result);
	   }
}
