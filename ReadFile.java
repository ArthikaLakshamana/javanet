/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class ReadFile{
  public static void main(String args[]){
  try{
File file = new File("data.txt");
FileInputStream fis = new FileInputStream(file);
InputStreamReader isr = new InputStreamReader(fis, cs);
BufferedReader br = new BufferedReader(isr);
String line;
while((line = br.readLine()) != null){
//process the line
System.out.println(line);
}
br.close();
}catch(Exception e){
System.out.println(e);
}
}
}

