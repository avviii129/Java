import java.io.File;
public class FileDeleting{
  public static void main (String[] args){
     File myFile = new File(".vscode");
    try{
      if(myFile.delete()){
      System.out.println("File " + myFile.getName() + " is deleted");}
      else {
      System.out.println("File Not Deleted !");}}
    catch(Exception e){
      System.out.println("Unable to delete a file");}
  }}