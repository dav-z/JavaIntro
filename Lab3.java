/*
    David Zheng
    Lab 3: ASCII Art
    February 2, 2018

        This code will print out the chevron design based on how many times you want it to repeat and the size of the image you choose
 */
package lab3;

/**
 *
 * @author dav
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chevron(7); // change this number to make change how many times the chevron pattern shows downwards
    }
    
    public static final int SIZE = 4; // change this number to change size of chevron design (have at least 2 for the right effect)
    
    public static void chevron(int times) {
        int h , i, j, k, l, m, n, o;
        for(h=0; h<times; h++) {
            for(i=0;i<SIZE;i++) {
                for(j=0;j<i;j++) {
                    System.out.print("!!!!");
                }
                for(k=0;k<2*SIZE-1-2*i;k++) {
                    System.out.print("iiii");
                }
                for(l=0;l<i;l++) {
                    System.out.print("!!!!");
                }
                System.out.println();
            }
            for(i=0;i<SIZE;i++) {
                for(m=0;m<i;m++) {
                    System.out.print("iiii");
                }
                for(n=0;n<2*SIZE-1-2*i;n++) {
                    System.out.print("!!!!");
                }
                for(o=0;o<i;o++) {
                    System.out.print("iiii");
                }
                System.out.println();
            }
        }
    }
    
}
