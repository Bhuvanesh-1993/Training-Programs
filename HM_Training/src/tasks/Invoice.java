package tasks;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Name: Bhuvanesh Date: 16-01-19 Address: 5/140,Perur,Coimbatore,Pin-641010. Mobile no: 9597962475 Tax: 18% Total Amount: 5500";
String arr[] = s.split(" ");
String s1 = "Name:";
String s2 = "Date:";
String s3 = "Address:";
String s4 = "Tax:";
String s5 = "Amount:";
for(int i=0;i<arr.length;i++) {
	if(arr[i].equalsIgnoreCase(s1)) {
		System.out.println("Name:"+arr[i+1]);
	}
}
for(int i=0;i<arr.length;i++) {
	if(arr[i].equalsIgnoreCase(s2)) {
		System.out.println("Date:"+arr[i+1]);
	}
}
for(int i=0;i<arr.length;i++) {
	if(arr[i].equalsIgnoreCase(s3)) {
		System.out.println("Address:"+arr[i+1]);
	}
}
for(int i=0;i<arr.length;i++) {
	if(arr[i].equalsIgnoreCase(s4)) {
		System.out.println("Tax:"+arr[i+1]);
	}
}
for(int i=0;i<arr.length;i++) {
	if(arr[i].equalsIgnoreCase(s5)) {
		System.out.println("Total Amount:"+arr[i+1]);
	}
}
}
}

