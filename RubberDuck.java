public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehaviour=new Squeak();
        flyBehaviour=new FlyNoWay();
    }
    void display(){
        System.out.println("This is Rubber Duck");

    }
}
