import java.util.*;

public class triangle01 {
    public static void main(String args[]){
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                int r = i+j;
                if (r%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
