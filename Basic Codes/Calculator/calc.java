import java.util.*;

public class calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF TIMES YOU WANT TO PERFORM CALCULATIONS");
        int n = sc.nextInt();
        int i = 0;
        while(i<n){
        System.out.println("Enter Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter a number to perform a specific Operation\n1)Addition 2)Subtraction 3)Multiplication 4)Division 5)Modulo");
        int c = sc.nextInt();

        switch (c) {
            case 1:
            System.out.println(a+b);
            break;

            case 2:
            System.out.println(a-b);
            break;

            case 3:
            System.out.println(a*b);
            break;

            case 4:
            System.out.println(a/b);
            break;

            case 5:
            System.out.println(a%b);
            break;
            
        
            default:
            break;
            }
            i++;
        }
    }
}
