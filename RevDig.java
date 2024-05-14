import java.util.Scanner;
public class RevDig{
  public static void main (String[] args){
  int i = 0;
  String revstr;
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  
  String[] strArr = str.split("");
  
  for (i=strArr.length;i>0;i--){
  revstr = (strArr[i] + "");
  
  System.out.println(revstr);}
   }}