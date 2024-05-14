import java.util.Scanner;
public class Fibonacci{
  public static void main (String[] args){
  int f1=0,f2=1,f3,n,i;
  Scanner sc = new Scanner (System.in);
  System.out.print("Enter the length of Fibonacci numeric serise \n");
  n = sc.nextInt();
  System.out.printf("%d%d",f1,f2);
  for (i=2;i<n;i++){
    f3=f1+f2;
    f1=f2;
    f2=f3;
        System.out.print(f3);}}}