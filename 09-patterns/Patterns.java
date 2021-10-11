package Patterns;
public class Patterns {
    public static void main(String[] args) {
    /* Print the Pattern
    1.  *****
        *****
        *****
        *****
        *****
    */
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    2.  *
        **
        ***
        ****
        *****
    */
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    3.  *****
        ****
        ***
        **
        *
    */
    for (int i = 0; i < 5; i++) {
        for (int j = i; j < 5; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /* Print the Pattern
    4.  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
    */
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print(j+1+" ");
        }
        System.out.println();
    }
    System.out.println("----------------------------------------------------------------");
    /*
    5.  *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
    */
     for(int row=1;row<=2*n;row++){
            if(row <= n) {
                for(int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }else {
                for (int col = 1; col <= 2*n-row; col++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    System.out.println("----------------------------------------------------------------");
    /*
    6.   *
        **
       ***
      ****
     *****
    */
     for(int row=1;row<=n;row++){
            for(int col=n;col>=1;col--){
                if(col>row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    System.out.println("----------------------------------------------------------------");
    /*
    7. *****
        ****
         ***
          **
           *
    */
     for (int row=0;row<=n;row++){
            for(int space=0;space<=row;space++){
                System.out.print(" ");
            }
            for(int col=n; col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    System.out.println("----------------------------------------------------------------"); 
    }
}
