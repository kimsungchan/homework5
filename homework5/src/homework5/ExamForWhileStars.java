package homework5;

import java.util.Scanner;



public class ExamForWhileStars {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		
		while(true){
	    System.out.println("**************");
		System.out.println("�ݺ��� �����ϱ�2");
		System.out.println("**************");
		System.out.println("1. ������ �����");
		System.out.println("2. �����ﰢ�� �����");
		System.out.println("3. �̵�ﰢ�� �����");
		System.out.println("4. ���̾Ƹ�� �����");
		System.out.println("5. �����ϱ�");
		System.out.print("���ϴ� �޴��� >> ");
		int number = s.nextInt();
		
		if(number == 1){
		 RectagleStars Rectag = new RectagleStars();
		 RectagleStars.Rectag();
		}
		else if(number == 2){
		 TriangleStars Triang = new TriangleStars();
		 TriangleStars.Triang();
		}
        else if(number == 3){
         IsoscelesTriangleStars ISO = new IsoscelesTriangleStars();	
         IsoscelesTriangleStars.ISO();
		}
        else if(number == 4){
         IsoscelesTriangleStars2 ISO2 = new IsoscelesTriangleStars2();
         IsoscelesTriangleStars2.ISO2();
        }
        else if(number == 5){
        	System.exit(0);
        }
      
	  }
   }
}
