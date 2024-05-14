import java.util.Scanner;
public class NumberToWords{
  public static void main (String[] args){
  int i = 0;
  
  Scanner sc = new Scanner(System.in);
  String str = sc.nextLine();
  
  String[] strArr = str.split("");
  int[] intArr = new int[strArr.length];
  
  for (i=0;i<strArr.length;i++){
  intArr[i] = Integer.parseInt(strArr[i]);}
  
  for (i=0;i<intArr.length;i++){
  if(intArr[i]==0){System.out.print("Zero ");}
  else if(intArr[i]==1){System.out.print("One ");}
  else if(intArr[i]==2){System.out.print("Two ");}
  else if(intArr[i]==3){System.out.print("Three ");}
  else if(intArr[i]==4){System.out.print("Four ");}
  else if(intArr[i]==5){System.out.print("Five ");}
  else if(intArr[i]==6){System.out.print("Six ");}
  else if(intArr[i]==7){System.out.print("Seven ");}
  else if(intArr[i]==8){System.out.print("Eight ");}
  else if(intArr[i]==9){System.out.print("Nine ");}}
  }}