import java.util.*;
public class ComplexCalculator{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		Double num1=0d;
		Double num2=0d;
		try{
		System.out.println("enter 1st number");
		num1 = Double.parseDouble(scan.next());
		System.out.println("enter 2nd number");
		num2 = Double.parseDouble(scan.next());
		}catch(Exception e){
			System.out.println("only numeric values are allowed ");
		}
		System.out.println("choose an operation : + - * /");
		String op = scan.next();
		Double result = 0d;
		
		switch(op){
			case "+" :  result : add(num1,num2);
						break;
			case "-" : result = sub(num1,num2);
						break;
			case "*" : result = multi(num1,num2);
						break;
			case "/" : result = div(num1,num2);
						break;
			default : System.out.println("Invalid operation");
						break;
			
		}
		System.out.println( num1 + " " +op + " "  + num2 +" = " + result);
		
	}
		private static Double add(double num1,double num2){
			
			return num1+num2;
		}
		private static Double sub(double num1,double num2){
			return num1-num2;
		}
		private static Double multi(double num1,double num2){
			return num1*num2;
		}
		private static Double div(double num1,double num2){
			return num1/num2;
		}
}