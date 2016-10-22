package homework5;
import java.util.*;

public class RectagleStars {
     public static void Rectag(){
    	 Scanner s = new Scanner(System.in);
    	 
    	 System.out.println("============================");
    	 System.out.println("정사각형 크기 입력 : ");
    	 int square = s.nextInt();
    	 
    	 for(int i=0 ; i < square ; i++){
    		 for(int j =0 ; j < square ; j++){
    		 System.out.print("*");
    		 }
    		 System.out.println();  	 
    	 } 
     }
}
