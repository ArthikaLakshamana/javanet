/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class books {
    String bookname;
    float amount;
    String availability;
    books(String bookname,float amount,String availability){
        this.bookname=bookname;
        this.amount=amount;
        this.availability=availability;
    }
    void display()
    {
        System.out.println(bookname+" "+amount+" "+availability);
    }
    class c
    {
        public static void main(String args[]){
        books a=new books("ABC", 250,"availability");
        books b=new books("DEF", 350,"notavailability");
        a.display();
        b.display();
        
    }
    
}

}
