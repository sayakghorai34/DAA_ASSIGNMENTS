import java.util.Scanner;

public class GCD_Normal {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int num1=sc.nextInt();
        System.out.println("Enter second num: ");
        int num2=sc.nextInt();
        int min=0;
        if(num1>num2){
            min=num2;
        }
        else{
            min=num1;
        }
        int gcd=1;
        for(int i=1;i<min+1;i++){
            count++;
            if(num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }
        System.out.println("Gcd is: "+gcd+"\nsteps: "+count);
    }
}