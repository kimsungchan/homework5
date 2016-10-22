package homework5;
import java.util.Scanner;

public class IsoscelesTriangleStars2 {
    public static void ISO2(){
    	Scanner s = new Scanner(System.in);
   	 
   	      System.out.println("============================");
   	      System.out.print("다이아몬드의 크기입력 : ");
   	      int square = s.nextInt();
   	 
   	        for(int i=0 ; i < square ; i++){
   		     for(int j =i ; j < square ; j++){
   		        System.out.print(" ");
             }
   		     for(int j = 0 ; j < i ; j++){
   		    	 System.out.print("*");
   		     }
   		     for(int j = 0 ; j< i-1 ; j++){
   		    	 System.out.print("*");
   		     }
   		         System.out.print("\n");
   	    } 
   	        
   	         for(int i = 0 ; i < square ; i++){
   	           for(int j = 0 ; j < i ; j++){ 
   	             System.out.print(" ");
   	           }
   	           for(int j = i ; j < square ; j++){
   	        	   System.out.print("*");
   	           }
   	           for(int j = i + 1  ; j < square ; j++){
   	        	   System.out.print("*");
   	           }
   	           System.out.print("\n");
   	    }      
   }
}