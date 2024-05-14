import java.util.Scanner;
public class SwitchCase {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter case number");
    n=sc.nextInt();
    switch(n){
      case 1 : System.out.println("hey");
    break;
      case 2 : System.out.println("hellow");
    break;
      case 3 : System.out.println("bye");
    break;
      default : System.out.println("Invalid");
    break;}
  }}