import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.println("Enter first value:");
		int enum1=In.nextInt();
		System.out.println("Enter second value:");
		int enum2=In.nextInt();

		System.out.println(enum1+"+"+enum2+"="+ (enum1 + enum2));
	}

}
