package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FindFrequentWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Paragraph");
		String[] arr = sc.nextLine().split("[, ?.@]+");
		int count = 1;
		String str1 = null;
		String str2;
		String a[] = new String[arr.length];
		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				str1 = arr[i];
				str2 = arr[j];
				if (str1.equalsIgnoreCase(str2)) {
					count++;
					arr[j] = "*";
				}
			}
			a[i] = str1;
			b[i] = count;
		}
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != "*"&&b[i]!=1) {

				map.put(a[i], b[i]);
//				//System.out.println(a[i]+b[i]);
			}
		}
		 Set<Entry<String, Integer>> set = map.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
	                set);
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1,
	                    Map.Entry<String, Integer> o2) {
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });
	        int i=0;
	        for (Entry<String, Integer> entry : list) {
	        	if(i<5){
	            System.out.println(entry.getValue()+" "+entry.getKey());
	        	i++;
	        	}
	        }


//		int l = 0;
//		for (Map.Entry<String,Integer> entry : map.entrySet()) {
//		    if (l < 5) {
//		        System.out.println(entry.getKey() + " = " + entry.getValue());
//		        l++;
//		    }
//				}
}
}

//i the see the i i the age is was is i see as am as age age as see