import java.util.*;

public class rev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to be Reversed");
        int n = sc.nextInt();
        int lastn;
        System.out.print("The Number is : ");
        while(n>0){
            lastn = n%10;
            n = n/10;
            System.out.print(lastn);
        }
    }
}