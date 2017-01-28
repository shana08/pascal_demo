import java.util.ArrayList;

public class IsOdd {
	void retOdd(ArrayList<Integer> input_array,ArrayList<Integer> odd_array){
		int num=input_array.remove(0);
		if((num&1)==1){
			odd_array.add(num);
		}
		while(!input_array.isEmpty()){
			retOdd(input_array,odd_array);
		}
	}
	
	public static void main(String[] args){
		ArrayList<Integer> origList = new ArrayList<Integer>();
		ArrayList<Integer> newList = new ArrayList<Integer>();
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,121,324,3423};
		for(int i=0;i<arr.length;i++){
		origList.add(i, arr[i]);
	}
		IsOdd obj=new IsOdd();
		obj.retOdd(origList, newList);
	}
}
	
