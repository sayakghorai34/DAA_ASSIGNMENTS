import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] Arr1 = CreateArr();
        int[] Arr2 = CreateArr();
        int[] Arr3 = CreateArr();
        System.out.println("Original Array1: " + Arrays.toString(Arr1));
        System.out.println("Original Array2: " + Arrays.toString(Arr2));
        System.out.println("Original Array3: " + Arrays.toString(Arr3));
        int[][] Sorted1=myInsertionSort(Arr1);
        int[][] Sorted2=myInsertionSort(Arr2);
        int[][] Sorted3=myInsertionSort(Arr3);
        printRes(Sorted1,Sorted2,Sorted3);
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
    static int[][] myInsertionSort(int[] Arr) {
        int SwapCount=0;
        int n = Arr.length;
        for (int i = 1; i < n; ++i) {
            int temp = Arr[i];
            int j = i - 1;
            while (j >= 0 && Arr[j] > temp) {
                Arr[j + 1] = Arr[j];
                j = j - 1;
                SwapCount++;
            }
            Arr[j + 1] = temp;
        }
        return new int[][]{Arr,new int[] {SwapCount,Arr.length}};
    }
    static void printRes(int[][] Sorted1,int[][] Sorted2, int[][] Sorted3){
        int[] Arr1=Sorted1[0];
        int[] Arr2=Sorted2[0];
        int[] Arr3=Sorted3[0];
        //Calculate Best case
        if(Sorted1[1][0]==0){
            System.out.println("Best Case is Arr1, Shift Required : "+Sorted1[1][0]+" Sorted Array is: "+Arrays.toString(Arr1));
        }
        if (Sorted2[1][0]==0) {
            System.out.println("Best Case is Arr2, Shift Required : "+Sorted2[1][0]+" Sorted Array is: "+Arrays.toString(Arr2));
        }
        if (Sorted3[1][0]==0) {
            System.out.println("Best Case is Arr3, Shift Required : "+Sorted3[1][0]+" Sorted Array is: "+Arrays.toString(Arr3));
        }
        //Average Case
        if(Sorted1[1][0]<(((Sorted1[1][1])*(Sorted1[1][1]-1))/2)&&Sorted1[1][0]!=0){
            System.out.println("Average Case is Arr1, Shift Required : "+Sorted1[1][0]+" Sorted Array is: "+Arrays.toString(Arr1));
        }
        if (Sorted2[1][0]<(((Sorted2[1][1])*(Sorted2[1][1]-1))/2)&&Sorted2[1][0]!=0) {
            System.out.println("Average Case is Arr2, Shift Required : "+Sorted2[1][0]+" Sorted Array is: "+Arrays.toString(Arr2));
        }
        if (Sorted3[1][0]<(((Sorted3[1][1])*(Sorted3[1][1]-1))/2)&&Sorted3[1][0]!=0) {
            System.out.println("Average Case is Arr3, Shift Required : "+Sorted3[1][0]+" Sorted Array is: "+Arrays.toString(Arr3));
        }
        //Worst case
        if(Sorted1[1][0]==(((Sorted1[1][1])*(Sorted1[1][1]-1))/2)){
            System.out.println("Worst Case is Arr1, Shift Required : "+Sorted1[1][0]+" Sorted Array is: "+Arrays.toString(Arr1));
        }
        if (Sorted2[1][0]==(((Sorted2[1][1])*(Sorted2[1][1]-1))/2)) {
            System.out.println("Worst Case is Arr2, Shift Required : "+Sorted2[1][0]+" Sorted Array is: "+Arrays.toString(Arr2));
        }
        if (Sorted3[1][0]==(((Sorted3[1][1])*(Sorted3[1][1]-1))/2)) {
            System.out.println("Worst Case is Arr3, Shift Required : "+Sorted3[1][0]+" Sorted Array is: "+Arrays.toString(Arr3));
        }
    }
}