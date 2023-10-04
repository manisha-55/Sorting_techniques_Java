public class Main
{
    public static void bubble_sort(int arr[], int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
	public static void main(String[] args) {
	    int arr[]={14,9,15,12,6,8,13};
	    int n=arr.length;
	    bubble_sort(arr, n);
		System.out.println("the sorted array is:");
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
