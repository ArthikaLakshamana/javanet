/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class collection {
    public static void main(String[] args) {
        Hashset<String>set=new Hashset<String>();
        set.add("ravi");
        set.add("vijay");
        set.add("ravi");
        set.add("ajay");
        Iterator<String>itr=set.iterator();
        while(itr.has next()){
        System.out.println(itr.next());
    }
    
}
}