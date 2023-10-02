import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задание 1

        int [] arrayInt = {1, 2, 3};
        float [] arrayFloat = {1.57f, 7.654f, 9.986f};
        double [] arrayDouble = {7.56, 8.978, 10.3};

        // Задание 2

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayFloat));
        System.out.println(Arrays.toString(arrayDouble));

        // Задание 3

        for (int i = 2; i >= 0; i--)
        {
            System.out.printf("%d", arrayInt[i]);
            if (i != 0)
            {
                System.out.printf(", ");
            }
        }
        System.out.println("");

        for (int i = 2; i >= 0; i--)
        {
            System.out.printf("%,.3f", arrayFloat[i]);
            if (i != 0)
            {
                System.out.printf(", ");
            }
        }
        System.out.println("");

        for (int i = 2; i >= 0; i--)
        {
            System.out.printf("%,.3f", arrayDouble[i]);
            if (i != 0)
            {
                System.out.printf(", ");
            }
        }
        System.out.println("");

        // Задание 4

        for (int i = 0; i < arrayInt.length; i++)
        {
            if(arrayInt[i] % 2 != 0)
            {
                arrayInt[i]++;
            }

        }
        System.out.println(Arrays.toString(arrayInt));





    }
}