import java.io.IOException;
import java.util.*;

class Bank {
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.1");
	}
	void child(){
		System.out.println("You are not a valid consumer for Loan as per your Age.");
	}
}
class SBI extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.5.");
	}
	void rateold(){
		System.out.println("You interest rate will be 7.5.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.125/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.075/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class BOI extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.8.");
	}
	void rateold(){
		System.out.println("You interest rate will be 9.5.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.128/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.095/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class HDFC extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 13.5.");
	}
	void rateold(){
		System.out.println("You interest rate will be 10.5.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.135/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.105/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class ICICI extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 13.");
	}
	void rateold(){
		System.out.println("You interest rate will be 10.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.13/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.1/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class AXIS extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.8.");
	}
	void rateold(){
		System.out.println("You interest rate will be 9.2.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.128/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.092/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class PNB extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.");
	}
	void rateold(){
		System.out.println("You interest rate will be 8.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.12/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.08/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class KOTAK extends Bank{
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 14.");
	}
	void rateold(){
		System.out.println("You interest rate will be 11.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.14/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.11/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}
class BOB extends Bank{
	@Override
	void messsage(){
		System.out.println("As per rule of Government \n We are showing this result.");
	}
	void rate(){
		System.out.println("You interest rate will be 12.6.");
	}
	void rateold(){
		System.out.println("You interest rate will be 8.9.");
	}
	void cal(int amt){
		double a = amt*Math.pow(1+(0.126/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
	void calold(int amt){
		double a = amt*Math.pow(1+(0.089/12), 12*5);
		String r = String.format("%.0f",a);
		System.out.println("You have to pay total amount after five years is " + r);
	}
}

public class LoanRate {
	public static void main(String args[]) throws IOException{
		//System.out.println("\t   Welcome to");
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[]{"SBI","BOI","HDFC","ICICI","PNB","KOTAK","BOB","AXIS"};
		System.out.println("***** Loan Interst Rate Finder *****");
		System.out.println("\t\tWelcome");
		Bank obj1 = new Bank();
		SBI obj2 = new SBI();
		BOI obj3 = new BOI();
		HDFC obj4 = new HDFC();
		AXIS obj5 = new AXIS();
		PNB obj6 = new PNB();
		BOB obj7 = new BOB();
		KOTAK obj8 = new KOTAK();
		ICICI obj9 = new ICICI();
		char con = 'N';
		
		do{
			System.out.println("Please provide personal information through that we will help you in a better way:");
			System.out.println("Enter your Name: ");
			String name = sc.next();
			System.out.println("Enter your Age: ");
			int age = sc.nextInt();
			System.out.println("Enter your Bank Name (i.e SBI,BOI,etc): ");
			String bank = sc.next();
			System.out.println("Enter Amount: ");
			int amount = sc.nextInt();
			System.out.println("Hi,"+name+ ". As per your bank we are finding best interest rate for you.");
			String bn = bank.toUpperCase();
			//System.out.println(bn);
			if(age<18){
				obj1.messsage();
				obj1.child();
			}
			else if(age>18 && 60>age){
				if(bn.contains("SBI")){
					obj2.messsage();
					obj2.rate();
					obj2.cal(amount);
				}
				else if(bn.contains("BOI")){
					obj3.messsage();
					obj3.rate();
					obj3.cal(amount);
				}
				else if(bn.contains("HDFC")){
					obj4.messsage();
					obj4.rate();
					obj4.cal(amount);
				}
				else if(bn.contains("AXIS")){
					obj5.messsage();
					obj5.rate();
					obj5.cal(amount);
				}
				else if(bn.contains("ICICI")){
					obj9.messsage();
					obj9.rate();
				}
				else if(bn.contains("PNB")){
					obj6.messsage();
					obj6.rate();
					obj6.cal(amount);
				}
				else if(bn.contains("KOTAK")){
					obj8.messsage();
					obj8.rate();
					obj8.cal(amount);
				}
				else if(bn.contains("BOB")){
					obj7.messsage();
					obj7.rate();
					obj7.cal(amount);
				}
			}
			else if(age>60){
				if(bn.contains("SBI")){
					obj2.messsage();
					obj2.rateold();
					obj2.calold(amount);
				}
				else if(bn.contains("BOI")){
					obj3.messsage();
					obj3.rateold();
					obj3.calold(amount);
				}
				else if(bn.contains("HDFC")){
					obj4.messsage();
					obj4.rateold();
					obj4.calold(amount);
				}
				else if(bn.contains("AXIS")){
					obj5.messsage();
					obj5.rateold();
					obj5.calold(amount);
				}
				else if(bn.contains("ICICI")){
					obj9.messsage();
					obj9.rateold();
					obj9.calold(amount);
				}
				else if(bn.contains("PNB")){
					obj6.messsage();
					obj6.rateold();
					obj6.calold(amount);
				}
				else if(bn.contains("KOTAK")){
					obj8.messsage();
					obj8.rateold();
					obj8.calold(amount);
				}
				else if(bn.contains("BOB")){
					obj7.messsage();
					obj7.rateold();
					obj7.calold(amount);
				}
			}
			System.out.println("If you want to continue then press Y else N");
			con = sc.next().charAt(0);
			//System.out.print("\033[H\033[2J");
			//System.out.flush();
			System.out.print('\f');
		}while(con == 'Y');
		System.out.println("Thank you for giving a chance to us.");
	}
}
