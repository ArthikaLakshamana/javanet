import java.util.*;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class mapp {
   public static void main(String args[]){
   Map<Integer,String> map=new HashMap<Integer,String>();
   map.put(100,"Amit");
   map.put(101,"Vijay");
   map.put(102,"Rahul");
    for(Map.Entry m:map.entrySet()){
     System.out.println(m.getKey()+" "+m.getValue());
}
}
}

    

