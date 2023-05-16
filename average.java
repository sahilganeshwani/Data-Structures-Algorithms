import java.util.*;
public class average {
    public static double average (double x, double y, double z) {
        return (x+y+z)/3;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the first number : ");
        double x = sc.nextDouble();
        System.out.print("enter the second number : ");
        double y = sc.nextDouble();
        System.out.print("enter the third number : ");
        double z = sc.nextDouble();
        System.out.print("the average of three numbers is : "+average(x,y,z)+"\n");
        sc.close();
    }
}
