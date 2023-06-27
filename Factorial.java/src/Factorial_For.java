import java.util.Scanner;

public class Factorial_For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num=sc.nextInt();
        long fact=1;
        int steps=0;
        for(long i=num;i>0;i--){
            fact*=i;
            steps++;
        }
        System.out.println("Fact is: "+fact+"\ncompleated in: "+steps+" steps");
  }
}