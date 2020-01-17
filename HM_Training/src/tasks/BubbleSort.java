package tasks;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,8,7,6,5,4,3,2};
		int temp=0;
		int count=0;
for(int i=0;i<arr.length-1;i++){
	for(int j=0;j<arr.length-1-i;j++){
		count++;	
		if(arr[j]>arr[j+1])
		{
		temp = arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;	
		}
		
	}
}
for(int x:arr) {
	System.out.println(x);
}
System.out.println("Count"+" "+count);
	}

}

