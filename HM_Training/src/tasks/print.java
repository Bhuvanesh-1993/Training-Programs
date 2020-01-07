package tasks;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int l = 0; l < arr.length; l++) {
				System.out.print(arr[i][l] + " ");
			}
			System.out.println(" ");
		}
	}

}
