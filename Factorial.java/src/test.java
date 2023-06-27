public class test {
    static void A(int N){
        if(N>=1){
            A(N-1);
            System.out.println(N);
        }
    }
    static void B(int N){
        if(N>=1){

            System.out.println(N);
            B(N-1);
        }
    }
    public static void main(String[] args) {
        //A(3);
        B(3);
    }
}
