import java.util.Scanner;

class Hello {
    public static void main(String arg[]) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c = sc.nextInt();
        // boolean b = sc.nextBoolean();

        System.out.println(a + c);

    }
}