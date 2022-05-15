package Modul3;

public class Task5 {
    public static void main(String[] args) {
        double[] val = {1.3, 3.2, 5.1, 4.7};
        {
            for (int i = 0; i < val.length; i++)
                System.out.println( val[i] + " " );
        }
        double total =0;
        for (int i=0; i < val.length;i++){
        total += val[i];}
        System.out.println("   " +total);
    double max = val[0];
    for (int i=0; i< val.length;i++) {
        if (val[i]>max) max=val[i];
    } System.out.println(max);
    }

}