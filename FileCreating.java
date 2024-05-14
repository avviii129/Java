import java.io.File;
public class FileCreating{
  public static void main (String[] args){
     File myfile = new File("avneesh.txt");
    try{
      myfile.createNewFile();}
    catch(Exception e){
      System.out.println("Unable to create a file");}
  }}