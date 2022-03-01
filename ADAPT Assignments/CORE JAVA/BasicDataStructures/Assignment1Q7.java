package BasicDataStructures;
class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	boolean searchArray = false;
    	for (int a : arr) {
    		if (a==toCheckValue) {
    			searchArray = true;
    			break;
    		}
    	}
    	if (searchArray) {
    		System.out.print(toCheckValue+" is present");
    }
    	else {
    		System.out.print("Given element is not present");
    	}
		return searchArray;
    }
}
public class Assignment1Q7 {
	public static void main(String[] args) {
		int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int toCheckValue = 19;
        SearchArray obj = new SearchArray();
        obj.searchArray(arr, toCheckValue);
}
}
