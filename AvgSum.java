import java.util.Scanner;
public class AvgSum{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0,i,avg=0,j,n;
    System.out.print("Enter the size of an array \n");
    n = sc.nextInt();
    System.out.print("Enter the values in array \n");
    int[] arr = new int[n];
    for (j=0;j<n;j++){
      arr[j] = sc.nextInt();}
    for (i=0;i<n;i++){
      sum = sum+arr[i];}
    avg = sum/arr.length;
 System.out.print("Average is "+avg);}}