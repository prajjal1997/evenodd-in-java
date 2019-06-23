import java.util.Scanner;

public class EvenOdd {
	int num;
	public EvenOdd(){
		System.out.println("Enter the number::");
	}
	public void func(int num){
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd e=new EvenOdd();
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		sc.close();
		e.func(b);

	}

}
