import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class FileReading{
  public static void main (String[] args){
    File myFile = new File("avneesh.txt");
    try{
      Scanner sc = new Scanner(myFile);
      while(sc.hasNextLine()){
      String line = sc.nextLine();
      System.out.println(line);}
      sc.close();}
    catch(Exception e){
      System.out.println("Unable to Read a file");}
  }}