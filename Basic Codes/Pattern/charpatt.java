import java.util.*;

public class charpatt {
    public static void main(String args[]){
        char ch = 'a';
        int n = 5;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
