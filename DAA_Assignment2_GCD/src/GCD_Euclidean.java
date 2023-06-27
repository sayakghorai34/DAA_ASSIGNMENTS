import java.util.Scanner;

public class GCD_Euclidean {
    static int count;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(("Enter The First Num: "));
        int num1=sc.nextInt();
        System.out.println();
        System.out.println("Enter the Second Num: ");
        int num2=sc.nextInt();
        int min=0;
        if(num1>num2){
            min=num2;
        }
        else{
            min=num1;
        }
        int max=num2+num1-min;
        int remainder=1;
        do {
            remainder=max%min;
            max=min;
            min=remainder;
            count++;
        }while ((remainder!=0));
        System.out.println("GCD using Euclidean method is: "+max+"\nsteps taken: "+count);
        }
    }

