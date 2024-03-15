import java.util.*;

public class primeSeries1{

    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
            isPrime = false;
            break;
        }
    }
    return isPrime;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which you want prime numbers");
        int x = sc.nextInt() ;
        for (int i = 2; i < x; i++) {
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }
}
