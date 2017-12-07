
package arrays1;

public class Arrays1 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[6];
        
        b=a;
        b[0] = 12;
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");;  
        }
        System.out.println("");
        
    
    b[4]=78;
    
    show(b);
    
    
    
    }//main
    
    public static void show(int[] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] +"\t");
           
        }//for
        System.out.println("");
    }//show
}//class
