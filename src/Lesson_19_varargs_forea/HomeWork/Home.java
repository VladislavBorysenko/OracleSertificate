package Lesson_19_varargs_forea.HomeWork;

public class Home {
    public static String[] abc(String[]... array1) {
        int lenght = 0;
        for (String[] array2 : array1) {
            lenght += array2.length;
        }
        String[] target = new String[lenght];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }


    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"},
                new String[]{"ok", "hello", "bye"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }

            }
           }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
        {

        }

    }
}
