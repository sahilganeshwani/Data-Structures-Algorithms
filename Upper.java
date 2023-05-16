abstract class Pen {
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen {
    void write() {
        System.out.println ("the Pen is working");
    }
    void refill() {
        System.out.println ("refill the Pen");
    }
    void changeNib() {
        System.out.println ("change the Nib");
    }
} 
public class Upper {
public static void main (String[] args) {
    Pen obj = new fountainPen();
    obj.write();
    obj.refill(); 
    fountainPen obj1 = new fountainPen();
    obj1.changeNib();
    }
}