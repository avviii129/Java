import java.util.Scanner;
public class PassFail {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Marks");
    int n = sc.nextInt();
    if(n>=50 && n<=100){
    System.out.print("PASS");}
    else if(n<0){
    System.out.print("Marks cannot be in negetives");}
    else if(n>100){
    System.out.print("Marks cannot be greater than 100");}
    if(n<50 && n>=0){
    System.out.print("FAIL");}
  }}