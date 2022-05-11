import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bingo = scan.nextLine();
        String[] plim = bingo.split(",");
        Customer_Account abc = new Customer_Account(plim[0], plim[1], plim[2]);
        System.out.println(abc);
    }
}