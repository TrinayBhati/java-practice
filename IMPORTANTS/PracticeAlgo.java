Binary Search

class binarySearch{
	public static boolean isSorted(int arr[]){
		for(int i = 0; i< arr.length ; i++){
			if(arr[i] > arr[i+1]){
				return false;
			}
		}
			 return true;
	}
	public static int binary(int arr[] , int x){
		
		int f = 0;
		int l = arr.length-1;
		while( f<=l){
			int mid = f + (l-f)/2;
			if(x == arr[mid]){
				return mid;
			}
			else if(x>arr[mid]){
				f = mid +1;
			}
			else{
				l = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 6, 8, 12, 19, 22, 45, 987, 5765};
		int x = 12;
		System.out.println(binarySearch(arr, x));
	}
}

//====================================================================

Linear Seach 

class linearSearch{
	public static int search(int arr[] , int x){
		for(int i = 0 ; i< arr.length ; i++){
			if(arr[i] == x)
				return i;
			}
				return -1;
	}

	public static void main(String[] args) {
		int arr[] = {21,43,56,66,678,32};
		int x = 56;
		System.out.println(search(arr, x));
	}
}

//========================================================

Binary Search

class binarySearch{
	public static void main(String[] args) {
		int arr[] = {2, 3, 5, 6, 8, 12, 90, 990};
		int x = 8;
		int n = arr.length;
		int mid;
		int f = 0 ; int l = n-1;

		while(f<=l){
			mid = f+(l-f)/2;
			if(arr[mid] == x){return mid;
				}			
			else if(arr[mid] < x){f =  mid +1;
				}					
			else{
				l = mid-1;
				}
		}	
	}
}

//=============================================================================

Bubble Sort

class Bubble{
	public static int sort(int arr[]){
		int n = arr.length;

		for(int i = 0; i<n-1 ; i++){
			for(int j = 0 ; j<n-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,3,121,5,32,75,89,123,8};
		System.out.print(sort(arr) + " ");
	}
}

//==================================================================

Selection Sort
