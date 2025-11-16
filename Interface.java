interface Animal{
  void sound();
}
class cat implements Animal {
  public void sound(){
    System.out.println("Meow Meow");
  }
}
public class Main{
  public static void main(String[] args){
    Animal a = new Cat();
    a.sound();
  }
}
