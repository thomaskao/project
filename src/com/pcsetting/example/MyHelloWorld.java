package com.pcsetting.example;

public class MyHelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!"); 
		System.out.println("�w��ϥ�java"); 
		System.out.println('A');
		System.out.println("�o�˦L\\ \"");
		System.out.println("�K�i��101�o�� \101");
		System.out.println("�Q���i��0061�o�� \u0061");
		System.out.println("�Q���i��o�� \u0061");
		System.out.println("�Q�i��10�O" +10);
		System.out.println("�K�i��10�O" +010);
		System.out.println("�Q���i��F�O" +0xF);
		
		
		//�ܼ�
		int num;
		char z;
		double db,dd;
		num = 3;
		System.out.println("num=" +num);
		
		int num1=5,num2;
		System.out.println("num1="+num1);
		num2=num1;
		System.out.println("num2=" +num2);

		//�|�h�B��
		int num3=10,num4=5;
		System.out.println("num3+num4=" +(num3+num4));
		System.out.println("num3-num4=" +(num3-num4));
		System.out.println("num3*num4=" +(num3*num4));	
		System.out.println("num/num4=" +(num3/num4));	
		System.out.println("num3%num4=" +(num3%num4));	
		
		int a=0,b=0,c=0;
		b=a++;
		c=++a;
		System.out.println("���ǭȦA+1�Ab="+b);
		System.out.println("��+1�A�ǭȡAc="+c);	
		
		double dnum=165.9;
		System.out.println("�����O"+dnum+"����");
		System.out.println("��double�ܦ�int(�����)");
		int inum =(int) dnum;
		System.out.println("�����O"+inum+"����");
		
		int d=2;
		double pi=3.14;
		System.out.println("���|�O"+d+ "����");
		System.out.println("�P���O"+d*pi+ "����");	
		
		int num5=5,num6=4;
		double div1 =num5/num6;
		double div2 =(double)num5/(double)num6;
		System.out.println("5/4="+div1);
		System.out.println("5/4="+div2);
		
		
		
		}
	
	


	

}
