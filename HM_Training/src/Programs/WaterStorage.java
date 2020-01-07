package Programs;

public class WaterStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,9,8,7,6,5,4,3,2,10};
		System.out.println(WaterStorage.answer(a));
}
		public static int answer(int[] list) {
		    int maxHeight = 0;
		    int previousHeight = 0;
		    int previousHeightIndex = 0;
		    int coll = 0;
		    int temp = 0;

		    // find the first peak (all water before will not be collected)
		    while(list[previousHeightIndex] > maxHeight) {
		        maxHeight = list[previousHeightIndex];
		        previousHeightIndex++;
		        if(previousHeightIndex==list.length)            // in case of stairs (no water collected)
		            return coll;
		        else
		            previousHeight = list[previousHeightIndex];
		    }

		    for(int i = previousHeightIndex; i<list.length; i++) {
		        if(list[i] >= maxHeight) {      // collect all temp water
		            coll += temp;
		            temp = 0;
		            maxHeight = list[i];        // new max height
		        }
		        else {
		            temp += maxHeight - list[i];
		            if(list[i] > previousHeight) {  // we went up... collect some water
		                int collWater = (i-previousHeightIndex)*(list[i]-previousHeight);
		                coll += collWater;
		                temp -= collWater;
		            }
		        }

		        // previousHeight only changes if consecutive towers are not same height
		        if(list[i] != previousHeight) {
		            previousHeight = list[i];
		            previousHeightIndex = i;
		        }
		    }
		    return coll;
		}

}