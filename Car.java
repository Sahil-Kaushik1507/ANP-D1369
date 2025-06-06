public class Car {

    String Company;
    String Model;
    String Color;
    int price;
    int TopSpeed;
    int currentSpeed;
    boolean airbags;

    void start() {
        System.out.println("car started");
    }

    void stop() {
        System.out.println("car stoped");
    }

    int currentSpeed() {
        return currentSpeed;
    }

    void print() {
        System.out.println(Company + " " + Model + " " + Color + " " + price + " " + TopSpeed + " " + currentSpeed + " "
                + airbags);
    }

    Car(String Company,String Model,String Color,int price,int TopSpeed,int currentSpeed,boolean airbags){

        this.Company=Company;
        this.Model=Model;
        this.Color= Color;
        this.price=price;
        this.TopSpeed= TopSpeed;
        this.currentSpeed=currentSpeed;
        this.airbags=airbags;

    }

    Car(String Company,String Model,String Color,int price){
        this.Company=Company;
        this.Model=Model;
        this.Color= Color;
        this.price=price;
    }

    static void add(int a, int b , int c){
        System.out.println(a+b+c);
    }


   

    public static void main(String[] args) {

        // Car car1= new Car();
        Car car1 = new Car("Ford","Mustang","z-blue",6000000,220,150,true);
        // car1.Company="Ford";
        // car1.Model="Mustang";
        // car1.Color="z-blue";
        // car1.price=6000000;
        // car1.TopSpeed=220;
        // car1.currentSpeed=150;
        // car1.airbags=true;

        car1.print();
        System.out.println(car1.currentSpeed());
        car1.start();

        Car car2 = new Car("Farari","red","xyz",10000000);
        // car2.Company="Farari";
        // car2.Model="xyz";
        // car2.Color="red";
        // car2.price=10000000;
        // car2.TopSpeed=320;
        // car2.currentSpeed=200;
        // car2.airbags=true;

        car2.print();
        System.out.println(car2.currentSpeed());
        car2.start();


        // Car car3 = new Car();
        // car3.Company="Tarzen";
        // car3.Model="abc";
        // car3.Color="purple";
        // car3.price=10000;
        // car3.TopSpeed=600;
        // car3.currentSpeed=300;
        // car3.airbags=false;

        // car3.print();
        // System.out.println(car3.currentSpeed());
        // car3.start();

    }
}
