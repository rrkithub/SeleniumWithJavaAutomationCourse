package JavaBasics;

class Engine {
    String enginename;
    int cc;

}

class Car {
    String name;
    int manuYear;
    Engine engine;

    Car(Engine eng) {
        engine = eng;
    }

    public void carInfo() {
        name = "Nano";
        manuYear = 2024;
        engine.enginename = "Tata";
        engine.cc = 1120;
        System.out.println("CarName : " + name);
        System.out.println("Model : " + manuYear);
        System.out.println("Engine Name : " + engine.enginename);
        System.out.println("Engine CC : " + engine.cc);

    }


}


public class HasARelationship {

    /*
    Composition :
    If an object contains the other object and
        the contained object cannot exits without
        the existenance of that
    */
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e);
        c.carInfo();
    }


}
