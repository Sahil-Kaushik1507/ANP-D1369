
class Vehicle{

     protected static int tyres;
    String Break;
    String Engine;
    int speed;

    void start(){
        System.out.println("vehicle started");
    }

    void acclerate(int s){
        speed = speed+s;
        System.out.println("new speed :" +speed);
    }

    void stop(){
        System.out.println("vehicle stoped");
    }

}

class Car extends Vehicle {

    String steering;
    boolean sunroof;
    int airbags;
    String brand;

    void musicSystem(){
        System.out.println("playing music...");
    }

    void print(){
        System.out.println(tyres +Break+Engine+speed+steering+sunroof+airbags+brand);
    }


}


class RacingCar extends Car{

        int maxspeed;

        void racing(){
            System.out.println("Running at "+ maxspeed);
        }

}


class Bike extends  Vehicle{


}


class TraficRulese {
    public static void main(String[] args) {

        System.out.println(Vehicle.tyres);
        
    }

    
    

}

public class Inhertance {

    // public static void main(String[] args) {

    //     Car c1= new Car();
    //     c1.Break="drum";
    //     c1.speed=100;
    //     c1.tyres=4;
    //     c1.sunroof=true;
    //     c1.brand="ford";
    //     c1.airbags=4;

    //     c1.start();
    //     c1.acclerate(20);
    //     c1.musicSystem();
    //     c1.print();


    //     RacingCar c2 = new RacingCar();

    //     c2.tyres=7;
    //     c2.airbags=8;
    //     c2.maxspeed= 300;

    //     c2.start();
    //     c2.musicSystem();
    //     c2.racing();
        






        
    // }
    
}
