import java.util.*;
public class StringOperations{
  public static void main (String[] args){
  String a = "    avneesh";
  String y = "YADAV   ";
  System.out.println(y.length());
  System.out.println((y.trim()).length());
  System.out.println(a.toUpperCase());
  System.out.println(y.toLowerCase());
  Boolean n = "avneesh".endsWith("sh");
  System.out.println(n);
  Boolean m = (a.trim()).startsWith("av");
  System.out.println(m);
  System.out.println(a.trim());
  System.out.println((a.trim()).length());}}