import java.util.Scanner;

public class Factorial_recurr {
    static int steps;
    public long factorial(long num){
        if(num>1) {
            steps++;
            return num * factorial(num - 1);
        }
        else return 1;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        long num=new Scanner(System.in).nextInt();
        long res=new Factorial_recurr().factorial(num);
        System.out.println("Factorial is: "+res+" steps:"+steps);
    }
}
