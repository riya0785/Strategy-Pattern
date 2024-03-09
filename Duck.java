abstract public class Duck {

    FlyBehaviour flyBehaviour;//object creation
    QuackBehaviour quackBehaviour;
    FloatBehaviour floatBehaviour;
    DrawnBehaviour drawnBehaviour;
    SwimBehaviour swimBehaviour;

    //Encapsulation.

    public void setFlyBehaviour(FlyBehaviour fb){ // setters
        flyBehaviour=fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }
    public void setFloatBehaviour(FloatBehaviour fb) {
        floatBehaviour = fb;
    }
    public void setDrawnBehaviour(DrawnBehaviour db) {
        drawnBehaviour = db;
    }
    abstract void display();//each and every will require display.

    //Implement two methods.

    public void performFly(){ // calling the interfaces.
        flyBehaviour.fly();
    }
    public void performQuack(){//calling the interfaces.
        quackBehaviour.quack();
    }
    public void performSwim(){//calling the interfaces.
        swimBehaviour.swim();
    }
    public void performDrawn(){//calling the interfaces.
        drawnBehaviour.drawn();
    }
    public void performFloat(){//calling the interfaces.
        floatBehaviour.floats();
    }
}
