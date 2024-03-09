public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        //constructor :object of a class.
        quackBehaviour=new Quack();
        flyBehaviour=new FlyWithWings();
        //multiple inheritance can't be used .
	swimBehaviour = new SwimWithWings();
    }
    @Override
    void display(){
        System.out.println("This the Red Head Duck...");

    }
}
