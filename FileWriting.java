import java.io.File;
import java.io.FileWriter;
public class FileWriting{
  public static void main (String[] args){
    try{
      FileWriter myFileWriter = new FileWriter("avneesh.txt");
      myFileWriter.write("Hey am avi");
      myFileWriter.close();}
    catch(Exception e){
      System.out.println("Unable to write in a file");}
  }}