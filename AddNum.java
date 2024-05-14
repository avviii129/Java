class A{
  int a = 10;
  void nep(){
    System.out.println("Nep Function in class A");}}

class B extends A{
  @Override // Override
  void nep(){
    System.out.println("Nep Function in class B");}}

public class AddNum{
public static void main (String[] args){
  A obj1 = new A();
  obj1.nep();
  B obj = new B();
  obj.nep();
  System.out.print(obj1.a);
}}