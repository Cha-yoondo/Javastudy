/*
 * 사용자 입력 ==> 0,1,2
 * 
 * => 0이면 => 가위
 * => 1이면 => 바위
 * => 2면 => 보
 */

import java.util.*;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner scan=new Scanner(System.in);
		System.out.print("사용자입력:");
		int user=scan.nextInt();
		
		if(user==2)
		{ System.out.println("Player:보");
		
		}
		
		if(user==1)
			{System.out.println("Player:바위");
		}
		if(user==0)
		{
			System.out.println("Player:가위");
		}
	
		//컴퓨터
		
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
			System.out.println("비겼다");
			
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
			System.out.println("비겼다");
			
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
			System.out.println("비겼다");
			
			if(user==2)
			{
			System.out.println("player Win!!");
		}
	}

}
