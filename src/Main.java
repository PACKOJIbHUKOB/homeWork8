import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("задача 1");
        System.out.println("<массив 1>,");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(Arrays.toString(weight));
        System.out.println("<массив 2>");
        float[] fractionalNumber = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(fractionalNumber));
        System.out.println("<массив 3>");
        double[] random = {153, 247, 854.26, 1243.01, 6578.12};
        System.out.println(Arrays.toString(random));
    }

    private static void task2() {
        System.out.println("задача 2");
        int[] weight = {1, 2, 3};
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        float[] fractionalNumber = {1.57f, 7.654f, 9.986f};
        for (int n = 0; n < fractionalNumber.length; n++) {
            if (n == fractionalNumber.length - 1) {
                System.out.print(fractionalNumber[n]);
                break;
            }
            System.out.print(fractionalNumber[n] + ", ");
        }
        System.out.println();
        double[] random = {153, 247, 854.26, 1243.01, 6578.12};
        for (int a = 0; a < random.length; a++) {
            if (a == random.length - 1) {
                System.out.print(random[a]);
                break;
            }
            System.out.print(random[a] + ", ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("задача 3");
        int[] weight = {1, 2, 3};
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        float[] fractionalNumber = new float[]{1.57f, 7.654f, 9.986f};
        for (int n = fractionalNumber.length - 1; n >= 0; n--) {
            if (n == 0) {
                System.out.print(fractionalNumber[n]);
                break;
            }
            System.out.print(fractionalNumber[n] + ", ");
        }
        System.out.println();
        double[] random = {153, 247, 854.26, 1243.01, 6578.12};
        for (int a = 4; a >= 0; a--) {
            if (a == 0) {
                System.out.print(random[a]);
                break;
            }
            System.out.print(random[a] + ", ");
        }
        System.out.println();

    }

    private static void task4() {
        System.out.println("задача 4");
        int[] weight = {1, 2, 3};
        for (int i = 0; i <= 2; i++) {
            if (i % 2 == 0) {
                weight[i]++;
                System.out.println(weight[i]);
            }
        }
    }
}