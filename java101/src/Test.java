import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        number = input.nextInt();
        int i = number, j;
        while (i > 0) {
            j = 0;
            while (j++ < number - i) {
                System.out.print(" ");
            }
            j = 0;
            while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}


