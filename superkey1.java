/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class superkey1 {
    String color="black";
}
class dog extends superkey1
{
	String color="white";

void printcolor()
{
	System.out.println(color);
	System.out.println(super.color);
}
}
class testsuper1 {
	

	public static void main(String[] args) {
	dog d=new dog();
	d.printcolor();// TODO Auto-generated method stub

	}

}

    

