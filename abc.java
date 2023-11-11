
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class abc {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a=0;
	int b=1;
	int c;
	int i=1;
	System.out.print("enter the number: ");
	int number=input.nextInt();
	System.out.print(a+" "+b);
	do{
		c=a+b;
		a=b;
		b=c;
		i++;
		System.out.print(" "+c);
	}while(i<=number-2);// TODO Auto-generated method stub
	}

	}



    

