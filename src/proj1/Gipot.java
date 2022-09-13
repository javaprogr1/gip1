package proj1;
import java.util.Scanner;
public class Gipot {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	        System.out.print("Введіть значення катетів.");
	        double a, b, c;
	        System.out.print("\nВведіть значення a: ");
	        a = input.nextDouble();
	        System.out.print("Введіть значення b: ");
	        b = input.nextDouble();
	        if (a <= 0 || b <= 0 ) {
	            System.out.print("Значення не може бути менше або дорівнювати нулю");
	        } 
	        if (a >1000 || b >1000 ) {
	        	System.out.print("Значення не може бути більшим за 1000");
	        }
	        else {
	        	 
	            c = Math.sqrt(a * a + b * b);
	            System.out.print("Гипотенуза: " + c);
	        }
	        
	      }
	    }



