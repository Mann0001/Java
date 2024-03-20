import java.util.*;

public class hollowRect {
    public static void main(String args[]){
        int n = 4;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=5 ; j++){
                if (j==1|| i==1 || i==n|| j==5) {
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
