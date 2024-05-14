import java.util.Scanner;
public class Grade{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks");
    int marks = sc.nextInt();
    
    if(marks>100){System.out.print("Your marks can't be greater than 100 *_* ");}
    else if(marks<0){System.out.print("Marks cannot be in negatives");}
    else if(marks>=90 && marks<=100){
    System.out.print("Grade A+ 'Excelent' ");}
    else if(marks>=80 && marks<=89){
    System.out.print("Grade A 'Very Good' ");}
    else if(marks>=70 && marks<=79){
    System.out.print("Grade B+ 'Good' ");}
    else if(marks>=60 && marks<=69){
    System.out.print("Grade B 'Fair' ");}
    else if(marks>=50 && marks<=59){
    System.out.print("Grade C+ 'Can do better' ");}
    else if(marks>=40 && marks<=49){
    System.out.print("Grade C 'Can do better' ");}
    else if(marks>=33 && marks<=39){
    System.out.print("Grade D 'Need to work really hard' ");}
    else if(marks<33 && marks>=0){
    System.out.print("Grade E 'Fail' ");}
  }}