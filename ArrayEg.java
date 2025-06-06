public class ArrayEg {

    public static void main(String[] args) {
        
        // int arr[] = {10,20,30,40,50};

        // int length = 5;

        // int arr1[]= new int[5];

        // int a = arr1[1]=20;
        // int b= arr1[5]=30; // arr1[5] index 0 1 2 3 4
        // int c= arr1[3]=50;

    //     int temp =29;
       
    //    for(int i =0;i<100;i++){

    //     arr1[i]= temp;
    //     temp=temp-20;
    //    }


    // int sum=0;
       
    //     for (int i : arr) {
    //         sum= sum+i;

    //         System.out.println(i);
            
    //     }

    //     for(int i=0; i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }

    //    System.out.println(a ); //20
    //    System.out.println( b); //
    //    System.out.println(c );
    //    System.out.println(arr1[2] ); // 0


    int arr2d[][]=  {{1,2,3},{4,5,6},{7,8,9}};

    //      0 1 2
    //    0 1 2 3
    //    1 4 5 6
    //    2 7 8 9


    int arr2d1[][]= new int[3][3];

    arr2d1[0][0]=10;
    System.out.println( arr2d1.length);

    for (int i = 0; i < arr2d1[i].length; i++) {

        for (int j = 0; j < arr2d1.length; j++) {
            arr2d1[i][j]=i*j;
        }
    }
      
    }
}
