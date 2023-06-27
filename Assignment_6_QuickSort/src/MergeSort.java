import java.util.Arrays;
import java.util.Scanner;

class MergeSort {
    static int Count;
    public static void main(String[] args){
        int[] arr = CreateArr();
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        myMergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Steps Required: "+Count);
    }
//######################################################################################################################
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
    static void merge(int[] arr, int l, int m, int r){
        int n1=m-l+1;
        int n2=r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
            Count++;
        }
        for(int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
            Count++;
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
            Count++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
            Count++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
            Count++;
        }
    }
    static void myMergeSort(int[] arr, int l, int r){
        if (l < r) {
            int m = l + (r - l) / 2;
            Count++;
            myMergeSort(arr, l, m);
            myMergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
