/*
 * ����� �Է� ==> 0,1,2
 * 
 * => 0�̸� => ����
 * => 1�̸� => ����
 * => 2�� => ��
 */

import java.util.*;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner scan=new Scanner(System.in);
		System.out.print("������Է�:");
		int user=scan.nextInt();
		
		if(user==2)
		{ System.out.println("Player:��");
		
		}
		
		if(user==1)
			{System.out.println("Player:����");
		}
		if(user==0)
		{
			System.out.println("Player:����");
		}
	
		//��ǻ��
		
		int com=(int)(Math.random()*3);
		 //            =============
		 //              0.0~0.99 * 3 ==>0.0~2.9...=>0~2
		if(com==2)
			
		{
			if(user==0)
			{
			System.out.println("computer Win!!");
			
			if(user==1)
			{
			System.out.println("����");
			
			if(user==2)
			{
			System.out.println("player Win!!");
		}
		if(com==1)
		{
			if(user==0)
			{
			System.out.println("computer Win!!");
			
			if(user==1)
			{
			System.out.println("����");
			
			if(user==2)
			{
			System.out.println("player Win!!");
		}
		if(com==0
				)
		{
			if(user==0)
			{
			System.out.println("computer Win!!");
			
			if(user==1)
			{
			System.out.println("����");
			
			if(user==2)
			{
			System.out.println("player Win!!");
		}
	}

}
