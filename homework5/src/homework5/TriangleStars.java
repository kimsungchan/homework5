package homework5;

import java.util.Scanner;

public class TriangleStars {
     public static void Triang(){
         Scanner s = new Scanner(System.in);
    	 
    	 System.out.println("============================");
    	 System.out.print("직각삼각형의 왼쪽여백과 높이입력  : ");
    	 int back = s.nextInt();
    	 int square = s.nextInt();
    	 for(int i= 0 ; i < square ; i++){
    		 for(int j = 0 ; j < back-square-i ; j++){
    		    	 System.out.print(" ");
    		 } 	 
    		 for(int j = 0 ; j < i+1 ; j++){
    			 System.out.print("*");
    		 }
    		     System.out.println();
    	 }
     }
   }

