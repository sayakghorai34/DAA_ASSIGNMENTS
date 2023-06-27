import java.util.*;
public class QuickSort {
    static int Count;
    public static void main(String[] args) {
        int[] Arr1 = CreateArr();
        System.out.println("Original Array1: " + Arrays.toString(Arr1));
        int[] Sorted1=myQuickSort(Arr1,0,Arr1.length-1);
        System.out.println("Sorted Arr is: "+ Arrays.toString(Sorted1));
        System.out.println("Checking pivot element: "+ Count);
    }
    static int[] CreateArr(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Arr?");
        int N=sc.nextInt();
        int[] Arr= new int[N];
        for(int i=0;i<N;i++){
            System.out.print("Enter "+(i+1)+"'th Element: ");
            Arr[i]=sc.nextInt();
        }
        return Arr;
    }
    static int getPartitionIndex (int[] arr, int start, int end){
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++){
            if (arr[j] < pivot){
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            else{
                Count++;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        Count++;
        return (i + 1);
    }
    static int[] myQuickSort(int[] Arr,int start, int end) {
        if (start < end)
        {
            int p = getPartitionIndex(Arr, start, end);
            myQuickSort(Arr, start, p - 1);
            myQuickSort(Arr, p + 1, end);
        }
        return Arr;
    }
}