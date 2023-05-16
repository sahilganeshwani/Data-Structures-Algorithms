public class advpatterns {

//#####################################################################    

    //star_pattern
    public static void star_pattern (int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//######################################################################    

    //inverted_star_pattern
    public static void inverted_star_pattern (int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//######################################################################    

    //half_pyramid
    public static void half_pyramid (int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

//######################################################################   

    //character_pattern
    public static void character_pattern (int n) {
        char ch='A';
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

//######################################################################    

    //hollow_rectangle
    public static void hollow_rectangle (int n, int m) {
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop-stars
            for (int j=1; j<=m; j++){
                //cell (i,j)
                if (i==1 || i==n || j==1 || j==m){
                    //boundry cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//######################################################################

    //inverted_rotated_half_pyramid
    public static void inverted_rotated_half_pyramid (int n) {
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//######################################################################    

    //inverted_rotated_half_pyramid_with_no
    public static void inverted_rotated_half_pyramid_with_no (int n) {
        for (int i=1; i<=n; i++){
            //numbers
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

//######################################################################    

    //floyd's_triangle
    public static void floyd_triangle (int n) {
        int c = 1;
        for (int i=1; i<=n; i++){
            //numbers
            for (int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

//######################################################################    

    //0,1_triangle
    public static void zerone_triangle (int n) {
        for (int i=1; i<=n; i++){
            //numbers
            for (int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                } else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

//######################################################################    

    //butterfly
    public static void butterfly (int n) {
        //1st half
        for (int i=1; i<=n; i++){
            //stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i=n; i>=1; i--){
            //stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//######################################################################    

    //solid_rhombus
    public static void solid_rhombus (int n) {
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//######################################################################    

    //hollow_rhombus
    public static void hollow_rhombus (int n) {
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//######################################################################    

    //diamond
    public static void diamond (int n) {
        //1st half
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i=n; i>=1; i--){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//######################################################################    

    //no_pyramid
    public static void number_pyramid (int n) {
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

//######################################################################    

    //palindromic_pattern_with_no
    public static void palindromic_pattern (int n) {
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers_in_desc_order
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            //numbers_in_asce_order
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();            
        }
    }

//######################################################################

    //diamond_inside_square
    public static void additional (int n){
        //1st half
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for (int i=n; i>=1; i--){
            //spaces
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            //stars
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------
    
    public static void main (String args[]) {
        
        star_pattern(4);
        inverted_star_pattern(4);
        half_pyramid(4);
        character_pattern(4);
        hollow_rectangle(4,4);
        inverted_rotated_half_pyramid(4);
        inverted_rotated_half_pyramid_with_no(4);
        floyd_triangle(4);
        zerone_triangle(4);
        butterfly(4);
        solid_rhombus(4);
        hollow_rhombus(4);
        diamond(4);
        number_pyramid(4);
        palindromic_pattern(4);
        additional(4);
    }
}