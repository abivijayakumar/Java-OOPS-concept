class car{
  String color = "Red";
  void start(){
    System.out.println("Car is starting..");
  }
}
public class Main{
  public static void main(String[] args){
    Car myCar = new Car();
    System.out.println(myCar.color);
    myCar.start();
  }
}
