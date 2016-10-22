package homework5;

import java.util.Scanner;

public class IsoscelesTriangleStars {
    public static void ISO(){
    	Scanner s = new Scanner(System.in);
   	 
   	        System.out.println("============================");
   	        System.out.println("이등변삼각형 높이입력 : ");
   	        int square = s.nextInt();
   	 
   	        for(int i=0 ; i < square ; i++){
   		      for(int j =0 ; j < square-1 ; j++){
   		         System.out.print("");
   		        }
   		    for(int j=0 ; j< 2*square-1 ;j++){
   		         System.out.println("*");  	
   		        }
   	       } 
      }
}
