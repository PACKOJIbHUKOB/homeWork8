public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}
    private static void task1() {
        System.out.println("задача 1");
        int[] weight=new int[3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        for (int i = 0; i < 3; i++) {
            System.out.println(weight[i]);
        }
        float[] fractionalNumber=new float[]{1.57f, 7.654f, 9.986f};
        for (int n = 0; n < 3; n++) {
            System.out.println(fractionalNumber[n]);
        }
        double[] random=new double[]{153,247,854.26,1243.01,6578.12};
        for (int a = 0; a < random.length; a++) {
            System.out.println(random[a]);
        }
    }
    private static void task2() {
        System.out.println("задача 2");
        int[] weight={1,2,3};

        for (int i = 0; i < 3; i++) {
            System.out.print(weight[i]+", ");
        }
        System.out.println();
        float[] fractionalNumber={1.57f, 7.654f, 9.986f};
        for (int n = 0; n < 3; n++) {
            System.out.print(fractionalNumber[n]+", ");
        }
        System.out.println();
        double[] random={153,247,854.26,1243.01,6578.12};
        for(int a = 0; a < random.length; a++) {
            System.out.print(random[a]+", ");
        }
        System.out.println();
    }
    private static void task3() {
        System.out.println("задача 3");
        int[] weight=new int[3];
        weight[0]=1;
        weight[1]=2;
        weight[2]=3;
        for (int i = 2; i >= 0; i--) {
            System.out.print(weight[i]+", ");
        }
        System.out.println();
        float[] fractionalNumber=new float[]{1.57f, 7.654f, 9.986f};
        for (int n = 2; n >=0; n--) {
            System.out.print(fractionalNumber[n]+", ");
        }
        System.out.println();
        double[] random={153,247,854.26,1243.01,6578.12};
        for (int a =4; a >=0; a--) {
            System.out.print(random[a]+", ");
        }
        System.out.println();

    }
    private static void task4() {
        System.out.println("задача 4");
        int[] weight={1,2,3};
        for (int i = 0; i <=2; i++) {
            if (i % 2==0){
                weight[i]++;
                System.out.println(weight[i]);
            }
        }
    }

    private static void task5() {
        System.out.println("задача 5");}

    private static void task6() {
        System.out.println("задача 6");}

    private static void task7() {
        System.out.println("задача 7");}

    private static void task8() {
        System.out.println("задача 8");}
}