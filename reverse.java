import java.util.*;

public class reverse {
    public static void main (String[] args) {
        String st = "sahil";
        String rev;
        for(int i =st.length();i>0;i--){
        rev += st.charAt(i);
        } 
        System.out.println(rev);
    }
}