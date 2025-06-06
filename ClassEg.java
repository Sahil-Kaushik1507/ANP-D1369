class ClassEg{
    
     int a = 10;
    int b = 20;
     

    static int count =0;

    static void add(int x, int y){
        System.out.println(x+y);
    }


    public static void main(String[] args) {

        ClassEg obj1 = new ClassEg();
            ClassEg.count++;
        ClassEg obj2 = new ClassEg();
            count++;
        ClassEg obj3 = new ClassEg();
            count++;
        ClassEg obj4 = new ClassEg();
            count++;

            System.out.println(count);

            add(4,6);
    }

}
