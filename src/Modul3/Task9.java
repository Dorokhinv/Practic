package Modul3;

public class Task9 {
    public static void main(String[] args) {
        int[] val = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
        int flag;
        for (int i = val.length - 1; i >= 0; i--) {
            System.out.print( val[i] + " " );
        }
        System.out.println();
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length - 1; j++) {
                if (val[j] < val[j + 1]) {
                    flag = val[j];
                    val[j] = val[j + 1];
                    val[j + 1] = flag;
                }
            }
            System.out.print( val[i] + " " );
        }
    }
}