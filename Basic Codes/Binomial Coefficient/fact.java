import java.util.*;

public class fact {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int BinCoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

        int BC = fact_n/(fact_r*fact_nr);
        return BC;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int a = sc.nextInt();
        System.out.println("Enter r value");
        int b = sc.nextInt();
        System.out.println("Binomial Coefficient is : "+BinCoeff(a , b));
    }
}
