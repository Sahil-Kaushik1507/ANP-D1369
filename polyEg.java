import java.util.Scanner;

public class polyEg {

    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(double a, int b){
        System.out.println(a+b);
    }

    static void add(int a, int b,double c){
        System.out.println(a+b);
    }
    
    static void add(int a, int b,int c){
        System.out.println(a+b+c);
    }
    
    static void add(int a, int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    
    static void add(double a, double b){
        System.out.println(a+b);
    }
    static void add(double a, double b,double c){
        System.out.println(a+b+c);
    }
    


    public static void main(String[] args) {

        // add(2,5);
        // add(2,5,5);
        // add(2,5,5,7);
        // add(4.5, 3.5);
        // add(4.5, 3.5,7.5);

        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            double b= sc.nextDouble();
            double d= sc.nextDouble();
            int c = sc.nextInt();

            add(b,d); // -- 6th
            add(a,c); // --1st


        
    }
}
