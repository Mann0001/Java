import java.util.*;

public class prime1 {

    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i = 2 ; i<=n-1 ; i++){
            if(n%i==0){
                 isPrime = false;
                 break;
        }
    }
    return isPrime;
}
    public static void main(String args[]){
        System.out.println(prime(11));
    }
}
