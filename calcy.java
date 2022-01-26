package day1;
import java.util.*;
import java.util.Scanner;
public class calcy {
    public static void main(String[] args)
    {
        System.out.println("Welcome to My Calculator:");
    	System.out.println("Enter first number and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection:");
        System.out.println(" 1 for Addition + ");
        System.out.println(" 2 for Substraction - ");
        System.out.println(" 3 for Multiplication * ");
        System.out.println(" 4 for Division / ");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;      
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
            default:
                System.out.println("Operation does not exist");
                

        }
        System.out.println("Thankyou For Using The Calculator:");


    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}
