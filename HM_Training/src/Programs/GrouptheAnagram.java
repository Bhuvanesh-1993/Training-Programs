package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class GrouptheAnagram {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Paragraph");
	String s = sc.nextLine();
	String[] arr = s.split(" ");
	for (int i = 0; i < arr.length; i++) {
	for(int j=0;j<arr.length;j++){
		if(i+1<arr.length){
		String str1 = arr[i];
		String str2 = arr[j];
		String s3 = tocheckanagram(str1,str2);
		if(s3!=null){
			System.out.println(str1);
			arr[i]="*";
		}
		}
			}
				}
	}
	 static String tocheckanagram(String str1, String str2){
	      String s1 = str1;  
	        String s2 = str2;  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toCharArray();  
	            char[] ArrayS2 = s2.toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	        	return s2;
	        } 
		return null;
		}
}
Output
//Enter the Paragraph
//act cat tac like
//act
//cat
//tac