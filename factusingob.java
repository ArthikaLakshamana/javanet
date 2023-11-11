/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class factusingob {
    int number=4;
    int i;
    int fact=1;
 public void fact(){
        for( i=1;i<=number;i++){
            fact=fact*i;
        }
 }
    public static void main(String[] args) {
        factusingob  a=new factusingob ();
        a.fact();
         
    }
}
    
