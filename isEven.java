import java.util.*;
public class isEven {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("enter an integer : ");
        num=sc.nextInt();
        if (isEven(num)){
            System.out.print("the number is even");
        }
        else {
            System.out.print("the number is odd");
        }
    }
    
    public static boolean isEven (int number) {
        if (number%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
}