package Diziler;
import java.util.Arrays;
import java.util.Scanner;

public class Odev_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("listenin eleman sayısı : ");
        int n = scanner.nextInt();
        int[] liste = new int[n];
        for (int i = 0; i < liste.length; i++){
            System.out.println((i + 1) + ". eleman");
            liste[i] = scanner.nextInt();
        }
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
    }
}
