import java.util.*;

public class calc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income");
        float income = sc.nextFloat();
        float tax = 0;

        if(income<500000){
            tax = 0;
        }

        if(income>=500000 && income<=1000000){
            tax = (income*20)/100;
        }

        if(income>=1000000){
            tax = (income*30)/100;
        }

        System.out.println("Income Tax is : "+tax);
    }
}