package assignment.Q_3;

public class Dog {
    private String color = "Black";
    Dog(){

    }
    Dog(String color){
        this.color=color;
    }
  void bark(){
      System.out.println(color + " dog is barking");
  }
void changeColor(String color){
    this.color=color;
}


}
