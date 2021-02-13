package lesson_18_ARRAY.Home;

public class ShowArrayTrue {
    public static void showArray(String[][] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < arr[i].length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + 1);
                }else {
                    System.out.print(arr[i][j]);

                }
            }
            if (i!=arr.length-1){
                System.out.print("}, ");
            }else {
                System.out.print("}");
            }
        }
        System.out.print(" }");
    }

    public static void main(String[] args) {
        String[][]array={{"apple","orange"},{"hello","bay","ok"},{"car"}};
        showArray(array);
    }
}
