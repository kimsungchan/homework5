package homework5;

import java.util.Scanner;

public class IsoscelesTriangleStars {
    public static void ISO(){
    	Scanner s = new Scanner(System.in);
   	 
   	        System.out.println("============================");
   	        System.out.print("이등변삼각형 높이입력 : ");
   	        int square = s.nextInt();
   	 
   	        for(int i=1 ; i <= square ; i++){
   		      for(int j =1 ; j <= square-i ; j++){
   		         System.out.print(" ");
   		        }
   		    for(int j=1 ; j<= 2*i-1 ;j++){
   		         System.out.print("*"); 	
   		        }
   		         System.out.print("\n");
   	       } 
      }
}
