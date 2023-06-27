import java.util.*;

class HeapSort {
    static int Step;
    static int[] CreateArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Arr?");
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter " + (i+1) + "'th Element: ");
            Arr[i] = sc.nextInt();
        }
        return Arr;
    }
    static void Heapify(int[] arr, int n, int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest]) {
            largest = left;
            Step++;
        }
        if (right<n && arr[right]>arr[largest]) {
            largest = right;
            Step++;
        }
        if (largest != i) {
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            Step++;
            Heapify(arr, n, largest);
        }
    }
    static void Heap_Sort(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--) {
            Step++;
            Heapify(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            Step++;
            Heapify(arr,i,0);
        }
    }
    public static void main(String[] args){
        int[] arr=CreateArr();
        Heap_Sort(arr);
        System.out.println("Sorted array is : "+ Arrays.toString(arr));
        System.out.println("Steps Required: "+Step);
    }
}
