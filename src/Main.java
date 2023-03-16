public class Main {
    public static void main(String[] args) {
        System.out.println("задача1");
        int[] minuts = {1, 2, 3};
        float[] minuts2 = {1.57f, 7.654f, 9.986f};
        char[] minuts3 = {'1', '2', '5', '9', '0', '7', '8',};


        for (int i = 0; i < minuts.length; i++) {
            System.out.print(minuts[i]);
            if (i != minuts.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < minuts2.length; i++) {
            System.out.print(minuts2[i]);
            if (i != minuts2.length - 1) {
                System.out.print(" ,");
            }
        }
        System.out.println();
        for (int i = 0; i < minuts3.length; i++) {
            System.out.print(minuts3[i]);
            if (i != minuts3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("задача 3");
        int[] minuts4 = {1, 2, 3};
        float[] minuts5 = {1.57f, 7.654f, 9.986f};
        char[] minuts6 = {'1', '2', '5', '9', '0', '7', '8',};
        for (int i = minuts4.length - 1; i >= 0; i--) {
            System.out.print(minuts4[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = minuts5.length - 1; i >= 0; i--) {
            System.out.print(minuts5[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = minuts6.length - 1; i >= 0; i--) {
            System.out.print(minuts6[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("задача4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length;i++){
            if (arr[i] % 2 !=0 ){
                arr[i] +=1;
                System.out.print(arr[i]);
                System.out.print(",");
            }
        }


    }
}














