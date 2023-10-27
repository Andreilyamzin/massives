import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int [ ] box = new int [3];
        box [0] =1;
        box [1] = 2;
        box [2] = 3;
        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);


        double [ ] corn = {1.57, 7.654, 9,986};
        System.out.println(corn [0]);
        System.out.println(corn [1]);
        System.out.println(corn [2]);


        int [] hotel = new int [6];
        hotel [0] = 50_000_00;
        hotel [1] = 30_000_00;
        hotel [5]= 20_000_000;
        System.out.println(hotel[5]);


        // Задача 2

        for (int i = 0; i < 3; i++) {
            System.out.print(box[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(corn[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {

            System.out.print(hotel[i] + ", ");
        }
        System.out.println();

        //Задача 3
        for (int i = 2; i >= 0 ; i--) {
            System.out.print(box[i] + ", ");
        }
        System.out.println();
        for (int i = 3; i >=0; i--) {
            System.out.print(corn[i] + ", ");
        }
        System.out.println();
        for (int i = 5; i >=0; i--) {

            System.out.print(hotel[i] + ", ");
        }
        System.out.println();

        //Задача 4
int [] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        if (arr[i] % 2 !=0);{
            arr[i] +=1;
            }
        }
        System.out.print(Arrays.toString(arr));

        System.out.println(" ");


        double [] arr1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            if (arr1[i] % 2 !=0);{
                arr1[i] +=1;
            }
        }
        System.out.print(Arrays.toString(arr1));

        System.out.println();
    }
}