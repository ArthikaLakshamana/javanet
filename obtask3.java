
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class obtask3 {
    String name;
    Scanner input = new Scanner(System.in);
    int N = input.next();
    void data();
    void totalprice();
}
void data(){
    String a[]=new String[N];
     for (int i=0;i<=N;i++){
        a[i]=input.next();
    }
}
void totalprice(){
    int sum=50*N;
    System.out.println(sum);
} 
public class void main(String args[]){
    obtask3 z=new obtask3();
    z.data();
    z.totalprice();
}
   