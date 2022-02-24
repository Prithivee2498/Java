package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		int arr1[] = {1,9,8,7,6,15};
		int arr2[] = {2,6,8,13,12};
  
		for(int i =0;i<arr1.length;i++) {
			for(int j =0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j])
					System.out.println("The intersection values are " + arr1[i]);

	}

		}
	}
}
