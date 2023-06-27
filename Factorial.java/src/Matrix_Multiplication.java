import java.sql.SQLOutput;
import java.util.Scanner;

public class Matrix_Multiplication {
    public static int[][] Matrix_Input(int row,int col){
    Scanner sc=new Scanner(System.in);
    int [][] A=new int[row][col];
    for(int i=0;i<col;i++) {
        for(int j=0;j<row;j++) {
            System.out.println("Enter element ["+i+"]["+j+"]: ");
            A[i][j]=sc.nextInt();
        }
    }
    return A;
}
    public static void Show_Matrix(int[][] A){
    for(int i=0;i< A.length;i++) {
        for(int j=0;j<A[0].length;j++) {
            System.out.print(A[i][j]+"\t");
        }
        System.out.println("");
    }

}
    public static int[][] Matrix_Multiply(int[][] A,int[][] B){
        int[][] C=new int[A.length][B[0].length];
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C[0].length;j++){
                C[i][j]=0;
                for(int k=0;k< A.length;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }

        }
        return C;
    }
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("No of Rows in First Matrix: ");
        int row1=sc1.nextInt();
        System.out.println("No of Columns in First Matrix: ");
        int col1=sc1.nextInt();
        System.out.println("No of Rows in Second Matrix: ");
        int row2=sc1.nextInt();
        System.out.println("No of Columns in Second Matrix: ");
        int col2=sc1.nextInt();
        if((row1!=0 && col1 != 0)&&(row2 != 0 && col2 != 0)){
            if(col1 == row2){
                int[][] A=Matrix_Input(row1,col1);
                int[][] B=Matrix_Input(row2,col2);
                int[][] C=Matrix_Multiply(A,B);
                Show_Matrix(C);
            }
            else{
                System.out.println("Invalid Matrix Size!!!");
            }
        }
        else{
            System.out.println("Row Column Can't Be '0'!!!");
        }
    }

    }

