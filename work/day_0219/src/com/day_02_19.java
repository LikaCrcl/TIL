package com.day;

import java.util.Scanner;

public class day_02_19 {
	
	static int temp;
	static int a;
	static int b;
	static int c;
	static int d;
	static int e;
	

	public static void main(String[] args) {
		
		short_test3();

	} // main
	
	
	
	static void short_change() {
		
		if(b < c) {
			temp = b;
			b = c;
			c = temp;
			if(a < b) {
				temp = a;
				a = b;
				b = temp;
				if(c < d) {
					temp = c;
					c = d;
					d = temp;
					if(b < c) {
						temp = b;
						b = c;
						c = temp;
						if(a < b) {
							temp = a;
							a = b;
							b = temp;
							if(d < e) {
								temp = d;
								d = e;
								e = temp;
								if(c < d) {
									temp = c;
									c = d;
									d = temp;
									if(b < c) {
										temp = b;
										b = c;
										c = temp;
										if(a < b) {
											temp = a;
											a = b;
											b = temp;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
   static void short_test3() {
		
		a = (int) (Math.random()*46);
		b = (int) (Math.random()*46);
		c = (int) (Math.random()*46);
		d = (int) (Math.random()*46);
		e = (int) (Math.random()*46);
		
		System.out.println("Original random numbers : ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("  ");
		
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
			short_change();
		}
		else {
			short_change();
		}
		
						
		System.out.println("Numbers in order : ");		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	static void short_ab() {
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
	}
	
	static void short_bc() {
		if(b < c) {
			temp = b;
			b = c;
			c = temp;
		}
	}
	
	static void short_cd() {
		if(c < d) {
			temp = c;
			c = d;
			d = temp;
		}
	}
	
	static void short_de() {
		if(d < e) {
			temp = d;
			d = e;
			e = temp;
		}
	}
	
	
	static void short_test4() {
		
		a = (int) (Math.random()*46);
		b = (int) (Math.random()*46);
		c = (int) (Math.random()*46);
		d = (int) (Math.random()*46);
		e = (int) (Math.random()*46);
		
		System.out.println("Original random numbers : ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("  ");
		
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
			short_bc();
			short_ab();
			short_cd();
			short_bc();
			short_ab();
			short_de();
			short_cd();
			short_bc();
			short_ab();
		}
		else {
			short_bc();
			short_ab();
			short_cd();
			short_bc();
			short_ab();
			short_de();
			short_cd();
			short_bc();
			short_ab();
		}
		
						
		System.out.println("Numbers in order : ");		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	
	static void star_grid() {
//		for (int i = 1; i < 10; i++) {
//		for (int j = 0; j < i; j++) {
//			System.out.print("*"+" ");
//		}
//		System.out.println("");
//		
//	}
	
//	for (int i = 10; i > 0; i--) {
//		for (int j = 0; j < i; j++) {
//			System.out.print(j + "_");
//		}
//		System.out.println(" ");
//	}
	

//	
//	for(int i=1;i<10;i++)
//	{
//		for(int m=1;m<10-i;m++)
//		{
//			System.out.print(" ");
//		}
//		
//		for(int j=0;j<i;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
//	for (int i = 1; i < 10; i++) {
//		for (int j = 10; j > i; j--) {
//			System.out.print(" ");
//		}
//		for (int x = 10; x>10-i  ; x--) {
//			System.out.print("*"); 
//		}
//
//		System.out.println("");
//	}
//	
//	
//	for (int i = 1; i < 10; i++) {
//		
//		for (int m = 1; m <10- i; m++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < i; j++) {
//			 System.out.print("*");
//		}
//		System.out.println();
//		   
//	}
		
//	for (int i = 1; i < 10; i++) {
//		for (int j = 9; j > 0; j--) {
//			if(i <j ) {
//				System.out.print(" ");
//			}else {
//				System.out.print("*");
//				
//			} 
//		}
//		System.out.println();
//	}
	
	
	
//	int max = 1;
//	while(max < 10) {
//		max++;
//		int innerMax = 1;
//		while(innerMax < max) {
//			System.out.print("*");
//			innerMax++;
//		}
//		System.out.println();
//	}
	
//	int max=10;
//	while(max>1) {
//		max--;
//		int innerMax = 1;
//		while(innerMax < 10) {
//			if(!(innerMax < max))
//			System.out.print("*");
//			else
//			System.out.print(" ");
//			innerMax++;
//		}
//		System.out.println();
//	}
	
//	int max1 =1;
//	while(max1<10) {
//		max1++;
//		int innerMax=10;
//		while(innerMax > 0) {
//			if(innerMax<max1)
//				{
//				System.out.print("*");
//				}
//			else
//			{
//				System.out.print(" ");
//				}
//			innerMax--;
//		}
//		System.out.println();
//	}

//	
//	for (int i = 1; i < 10; i++) {
//		for (int j = 9; j > 0; j--) {
//			
//			if(i < j) {
//				System.out.print(" ");
//			}else {
//				System.out.print("*");
//			}
//		}
//		System.out.println("");
//	}
	
	
	for (int i = 1; i < 10; i++) {
		
		for (int j = 0; j < 10-i; j++) {
			System.out.print("a");
		}
		for (int j = 1; j < i*2; j++) {
			
			System.out.print("*");
		}
		for (int j = 0; j < 10-i; j++) {
			System.out.print("a");
		}
		
		System.out.println("");
	}
	
//	for (int i = 1; i < 10; i++) {
//		for (int j = 0; j < 10-i; j++) {
//			System.out.print("*");
//			
//		}
//		for (int j = 10; j> 10-i; j--) {
//			System.out.print("/");
//		}
//		
//		for (int j = 0; j < i ; j++ ) {
//			
//			System.out.print("0");
//		}
//
//		for (int j = 10; j > i; j--) {
//			System.out.print("1");
//			
//		}
//		System.out.println();
//	}


	
		
	}

	static void while_do_input() {
		
		// 0 이하이거나 100 이상일 때 입력하면 do while 나가기 or
				Scanner input = new Scanner(System.in);
				System.out.println("아무 숫자나 입력하세요");
				do {
					int num = input.nextInt();
					System.out.println("test"+num);
					if(num <= 0 || num >= 100)
						break;
					System.out.println("또 입력하세요");
				}while(true);
				System.out.println("do을 나왔어요");
		
	}
	
	static void while_test3() {
		int count = 0;

		do {
			count++;
			System.out.println("do");
			if(count == 9)
				break;	
		}while(true);

		count = 0;
		do {

			count++;
			System.out.println("do :" + count);
			//			if(count == 9)
			//				break;	
		}while(count < 9);

	
	}
	
	static void gugudan(int n) {
		int count = 1;
		while(true) {
			count++;
			if(n == 2) {
				caculator(count);
			}
			else if(count % 2 == n) {
				caculator(count);
			}
			
			if(count == 9)
				break;
		}	
	}
	
	static void  caculator(int n) {
		int count = 1;
		while(count < 10) {
			System.out.println(n + "*"+count+"="+ n* count);
			count++;
		}
	}
		
	static void while_test() {
		int count = 2;
		while(count < 10) {
			int j= 1;
			while(j < 10) {
				System.out.println(count);
				j++;
				
			}
			count++;
			System.out.println("--------------"+count);
			System.out.println("--------------");
			
		}
	}

}
