package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=123,a,b,c,d;
		System.out.println("the number is"+123);
		a=n%10;
		System.out.println(a+"");
		n=n/10;
		System.out.println(n+"");
		b=n%10;
		System.out.println(b+"");
		c=n/10;
		System.out.println(c+"");
		d=a+b+c;
		System.out.println("sum of digits"+d);
	}
}

