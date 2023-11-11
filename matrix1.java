/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class matrix1 {
	public static void main(String args[])
	{
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the base of squared matrices");
	int n=num.nextInt();
	int[][] matrix1=new int[n][n];
	int[][] matrix2=new int[n][n];
	System.out.println("Enter the elements of 1st matrix row wise");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	matrix1[i][j]=num.nextInt();
	}
	}
	System.out.println("Enter the elements of 2nd matrix row wise");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	matrix2[i][j]=num.nextInt();
	}
	}
	int result[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	for(int k=0;k<n;k++)
	{
	result[i][j]+=matrix1[i][k]*matrix2[k][j];
	}
	}
	}
	System.out.println("Multiplying the matrices...");
	System.out.println("The product is:");
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	System.out.print(result[i][j]+" ");
	}
	System.out.println();
	}
	}
	}
	

	
		// TODO Auto-generated method stub

	}


