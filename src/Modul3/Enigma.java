package Modul3;

import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        System.out.println("Введите пароль:");
        String PW= scanner.nextLine();
        if(PW.length()< 8 || PW.length()> 15){
            do {
                System.out.println("Длина пароля должна быть больше  8 и меньше 15");
                PW= scanner.nextLine();
            }while (PW.length()>8 || PW.length()<15);
        } System.out.printf("%s,Your new password %s",name,PW);
    }
}
