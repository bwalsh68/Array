
package arrayschp7;

import java.util.Arrays;

public class ArraysChp7 {
    public static int[] loadWithRandom(){
        int[] a = new int[10];
        
        for (int i = 0; i < a.length; i++) {
             a[i] = (int)(100*Math.random()+1);    
        }//for
        
        return a;
    }// load with random
    
    public static void display(int[] a){
        for(int i:a)
            System.out.print(i+", ");
        System.out.println("");
    }//display
    
    
    public static int[] reverse(int[] a){
        int[] b = new int[10];
        
        for (int i = 0; i < a.length; i++) {
            for(int j = a.length-1; j>0;j--)
               b[j]= a[i];
            
        }//i
        System.out.println(Arrays.toString(b));
        
        return b;
    }//reverse
    public static void main(String[] args) {
        int[] matrix = new int[10];
        
        matrix = loadWithRandom();
        display(matrix);
        System.out.println(Arrays.toString(matrix));
        matrix = reverse(matrix);    
    }//main;
    
}//class
