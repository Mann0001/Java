import java.util.*;

public class butterflypatt {
    public static void main(String args[]){
        int n = 4;

        //First half 
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            for(int k = 1 ; k<=2*(n-i) ; k++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second half
        for(int i = n ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            for(int k = 1  ; k<=2*(n-i) ; k++){
                System.out.print(" ");
            }

            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}