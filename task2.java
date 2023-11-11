/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class task2 {
    String name;
    int matmark;
    int phymark;
    int chemmark;
    float average;
    mark(String v;int mat;int phy;int chem;float avg{
    name=v;
    matmark=mat;
    phymark=phy;
    chemmark=chem;
    average=avg;
}
    void display()
    {
        
        System.out.println(name+" "+matmark+" "+phymark+" "+chemmark+" "+average);
    }
        void total()
        {
            average=(matmark+phymark+chemmark)/3;
            System.out.println(" "+average);
        }
        public static void main(String args[]){
            task2 a=new task2("xy",78,45,86);
            task2 b=new task2("yz",87,96,57);
            a.display();
            b.display();
            a.total();
            b.total();
            
        }
    }
    
