class OverLoading{
  
  void Volume(int a){
  System.out.println("Volume of cube is " + a*a*a + " Unit Cube");}
  
  void Volume(int h, int b, int l){
  System.out.println("Volume of cuboide is " + h*b*l + " Unit Cube");}
  
}

public class Volumes{
  public static void main (String args[]){
  OverLoading vol = new OverLoading();
  vol.Volume(8);
  vol.Volume(3,4,5);}}