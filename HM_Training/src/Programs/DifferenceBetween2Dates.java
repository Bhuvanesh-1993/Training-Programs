package Programs;

import java.util.Scanner;

public class DifferenceBetween2Dates {
 
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the from date as this format'24-9-1993'");
String arr1[] = sc.nextLine().split("[-]+");
System.out.println("Enter the from date as this format'24-9-1993'");
String arr2[] = sc.nextLine().split("[-]+");
int arr3[] = new int[3];
int arr4[] = new int[3];
//Create an array contains no.of days month wise
int arr5[] = {31,28,31,30,31,30,31,31,30,31,30,31};
int monthindays1 = 0, monthindays2 = 0;
//To get the date as string
//and convert string value into integer value
//Separate the string and save the 2 different array
for(int i=0;i<3;i++){
	arr3[i] = Integer.parseInt(arr1[i]);
	arr4[i] = Integer.parseInt(arr2[i]);
}
for(int i=0;i<arr3[1]-1;i++){
monthindays1 = monthindays1+arr5[i];
}
for(int i=0;i<arr4[1]-1;i++){
monthindays2 = monthindays2+arr5[i];
}
//Calculate the no.of leap years
int numberofleapyears1 = (arr3[2]/4)-(arr3[2]/100)+(arr3[2]/400);
int numberofleapyears2 = (arr4[2]/4)-(arr4[2]/100)+(arr4[2]/400);
//Convert Years In date
int yearindays1 = (arr3[2]-numberofleapyears1)*365+(numberofleapyears1*366);
int yearindays2 = (arr4[2]-numberofleapyears2)*365+(numberofleapyears2*366);
int noofdays1 = arr3[0];
int noofdays2 = arr4[0];
//Calculate the no of days different between the 2 dates 
int noofdaysin1styear = monthindays1+yearindays1+noofdays1;
int noofdaysin2ndyear = monthindays2+yearindays2+noofdays2;
int diffofdates = noofdaysin1styear-noofdaysin2ndyear;
System.out.println(Math.abs(diffofdates));
}
}
//Output:
//	Enter the from date as this format'24-9-1993'
//	24-09-1993
//	Enter the from date as this format'24-9-1993'
//	30-12-2019
//	9593