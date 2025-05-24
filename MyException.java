import java.util.Scanner;
public class MyException extends Exception{//step-1
    public MyException(String s) {//step-2
    	super(s);//forward child class exception description to parent class
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		int balance=sc.nextInt();
		if(balance<1000) {
			try {
			MyException m=new MyException("Insufficient Balance");
			throw m;
			}catch(MyException m) {
				m.printStackTrace();
			}			
		}
		else {
			System.out.println("Happy Diwali");
		}
	}

}
