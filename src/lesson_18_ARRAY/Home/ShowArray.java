package lesson_18_ARRAY.Home;

public class ShowArray {
    public static void showArray(String[][]arr){

        for (int i = 0; i <arr.length ; i++) {


            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");

            }   System.out.println();
        }
    }


    public static void main(String[] args) {
        
        String[][]arr={{"Privet","kak","dela"},{"y","menya","vse"},{"horosho","spasibo"}};
        showArray(arr);
    }
}