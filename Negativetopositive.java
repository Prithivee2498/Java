package week1.day2;

public class Negativetopositive {

	public static void main(String[] args) {
		int x=-40;
		if(x<0) {
		int y=x+(2*(-1*x));
		
		System.out.println(y+"-40 is converted to 40");
		}
		else {
			System.out.println("its not a negative number");
		}
	}

}
