package com.pcsetting.example;

public class MyHelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!"); 
		System.out.println("歡迎使用java"); 
		System.out.println('A');
		System.out.println("這樣印\\ \"");
		System.out.println("八進位101這樣 \101");
		System.out.println("十六進位0061這樣 \u0061");
		System.out.println("十六進位這樣 \u0061");
		System.out.println("十進位10是" +10);
		System.out.println("八進位10是" +010);
		System.out.println("十六進位F是" +0xF);
		
		
		//變數
		int num;
		char z;
		double db,dd;
		num = 3;
		System.out.println("num=" +num);
		
		int num1=5,num2;
		System.out.println("num1="+num1);
		num2=num1;
		System.out.println("num2=" +num2);

		//四則運算
		int num3=10,num4=5;
		System.out.println("num3+num4=" +(num3+num4));
		System.out.println("num3-num4=" +(num3-num4));
		System.out.println("num3*num4=" +(num3*num4));	
		System.out.println("num/num4=" +(num3/num4));	
		System.out.println("num3%num4=" +(num3%num4));	
		
		int a=0,b=0,c=0;
		b=a++;
		c=++a;
		System.out.println("先傳值再+1，b="+b);
		System.out.println("先+1再傳值，c="+c);	
		
		double dnum=165.9;
		System.out.println("身高是"+dnum+"公分");
		System.out.println("把double變成int(取整數)");
		int inum =(int) dnum;
		System.out.println("身高是"+inum+"公分");
		
		int d=2;
		double pi=3.14;
		System.out.println("直徑是"+d+ "公分");
		System.out.println("周長是"+d*pi+ "公分");	
		
		int num5=5,num6=4;
		double div1 =num5/num6;
		double div2 =(double)num5/(double)num6;
		System.out.println("5/4="+div1);
		System.out.println("5/4="+div2);
		
		
		
		}
	
	


	

}
