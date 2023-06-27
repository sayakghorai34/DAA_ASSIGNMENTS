import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] Arr1 = CreateArr();
        int[] Arr2 = CreateArr();
        int[] Arr3 = CreateArr();
        System.out.println("Original Array1: " + Arrays.toString(Arr1));
        System.out.println("Original Array2: " + Arrays.toString(Arr2));
        System.out.println("Original Array2: " + Arrays.toString(Arr2));
        int[][] Sorted1=myBubbleSort(Arr1);
        int[][] Sorted2=myBubbleSort(Arr2);
        int[][] Sorted3=myBubbleSort(Arr3);
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
    static int[][] myBubbleSort(int[] Arr) {
        int SwapCount=0;
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                    SwapCount++;
                }
            }
        }
        return new int[][]{Arr,new int[] {SwapCount,Arr.length}};
    }
    static void printRes(int[][] Sorted1,int[][] Sorted2, int[][] Sorted3){
        int[] Arr1=Sorted1[0];
        int[] Arr2=Sorted2[0];
        int[] Arr3=Sorted3[0];
        //Calculate Best case
        if(Sorted1[1][0]==0){
            System.out.println("Best Case is Arr1, Swapped required : "+Sorted1[1][0]+" Sorted Array is: "+Arrays.toString(Arr1));
        }
        if (Sorted2[1][0]==0) {
            System.out.println("Best Case is Arr2, Swapped required : "+Sorted2[1][0]+" Sorted Array is: "+Arrays.toString(Arr2));
        }
        if (Sorted3[1][0]==0) {
            System.out.println("Best Case is Arr3, Swapped required : "+Sorted3[1][0]+" Sorted Array is: "+Arrays.toString(Arr3));
        }
        //Average Case
        if(Sorted1[1][0]<(((Sorted1[1][1])*(Sorted1[1][1]-1))/2)&&Sorted1[1][0]!=0){
            System.out.println("Average Case is Arr1, Swapped required : "+Sorted1[1][0]+" Sorted Array is: "+Arrays.toString(Arr1));
        }
        if (Sorted2[1][0]<(((Sorted2[1][1])*(Sorted2[1][1]-1))/2)&&Sorted2[1][0]!=0) {
            System.out.println("Average Case is Arr2, Swapped required : "+Sorted2[1][0]+" Sorted Array is: "+Arrays.toString(Arr2));
        }
        if (Sorted3[1][0]<(((Sorted3[1][1])*(Sorted3[1][1]-1))/2)&&Sorted3[1][0]!=0) {
            System.out.println("Average Case is Arr3, Swapped required : "+Sorted3[1][0]+" Sorted Array is: "+Arrays.toString(Arr3));
        }
        //Worst case
        if(Sorted1[1][0]==(((Sorted1[1][1])*(Sorted1[1][1]-1))/2)){
            System.out.println("Worst Case is Arr1, Swapped required : "+Sorted1[1][0]+" Sorted Array is: "+Arrays.toString(Arr1));
        }
        if (Sorted2[1][0]==(((Sorted2[1][1])*(Sorted2[1][1]-1))/2)) {
            System.out.println("Worst Case is Arr2, Swapped required : "+Sorted2[1][0]+" Sorted Array is: "+Arrays.toString(Arr2));
        }
        if (Sorted3[1][0]==(((Sorted3[1][1])*(Sorted3[1][1]-1))/2)) {
            System.out.println("Worst Case is Arr3, Swapped required : "+Sorted3[1][0]+" Sorted Array is: "+Arrays.toString(Arr3));
        }
    }
}