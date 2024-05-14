import java.util.Scanner;
public class Table{
  public static void main (String[] args){
  Scanner sc = new Scanner (System.in);
  long n,i;
  System.out.print("Print Numeric Tabels \n Enter number \n");
  n = sc.nextInt();
  for (i=0;i<=10;i++){
  System.out.print(n + " x " + i +" = " + n*i + "\n");}
  }}