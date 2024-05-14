class MultithreadingDemo2 implements Runnable{
  public void run(){
    try{
    System.out.println("Thread " + Thread.currentThread().getId() + " is Running");}
    catch(Exception e){
      System.out.println("Exception is caught");
    }}
}

public class MultithreadingWithRunnable{
  public static void main(String[] args){
    for(int i=0;i<=10;i++){
    Thread object = new Thread(new MultithreadingDemo2());
    object.start();}}}