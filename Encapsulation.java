class person{
  private String name;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
}
public class Main{
  public static void main(String[] args){
    person p = new person();
    p.setName("Abinaya");
    System.out.println(p.getName());
  }
}
