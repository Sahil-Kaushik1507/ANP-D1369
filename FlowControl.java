public class FlowControl {

    public static void main(String arg[]){

        // boolean condition = true;
        // int age =21;

        // if(age>18){
        //     System.out.println("you can vote");
        // }else{

        //     System.out.println("you can't vote");
        // }


        // boolean rich= false;
        // boolean goodlooking= false;
        // boolean respectful=false;

        // if(rich && goodlooking && respectful){
        //         if(goodlooking){
        //             if(respectful){
        //                 System.out.println("selected...");
        //             }else{
        //                 System.out.println("rejected due to respectfulness");
        //             }
        //         }else{
        //             System.out.println("you are rejected due to looks");
        //         }
        // }else{
        //     System.out.println("rejected due to lack of money");
        // }

        // if(rich){
        //     System.out.println("selected1");
        // }else if( goodlooking){
        //     System.out.println("selected2");
        // }else if (respectful){
        //     System.out.println("selected3");
        // }else{
        //     System.out.println("selected4");
        // }


        int days =3;


        switch (days) {
            case 1: //1==4
                System.out.println("Monday");
                break;
            case 2: //2==4
                System.out.println("Tue");
                break;
            case 3: //3==3
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thr");
                break;
            

          
            default:
                System.out.println("not a valid day");
                break;
        }
    }
    
}


// if , if else , nested if else , if else ledder
// switch