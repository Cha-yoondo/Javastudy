import java.util.Scanner;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane.ScalableIconUIResource;

public class 자바출력메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		/*
		System.out.printf("%d*%d=%d\t",2,2,4);
		System.out.printf("%d*%d=%d",2,3,6);

		*/
		
		Scanner scan=new Scanner(System.in);
		
		/*
		 *  Scanner : 데이터형
		 *  scan : 변수
		 *  new : 메모리에 저장
		 *  Scanner(System.in) : 초기화
		 */
		System.out.println("1' 정수입력:");
		int a=scan.nextInt();//  입력된 정수를 읽어와서 a라는 메모리에 저장
		//System.out.println("2' 정수입력:");
		int b=scan.nextInt();
		System.out.println("3' 정수입력:");
		int c=scan.nextInt();
		// 출력
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		//Scaneer => 도스에서만 사용
	}

}
