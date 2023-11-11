import java.io.File;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arthi
 */
public class deleteFile {
  public static void main(String[] args) {
  File file = new File("data.txt");
  boolean delete = file.delete();
  System.out.println("File deleted = " + delete);
}
}

    

