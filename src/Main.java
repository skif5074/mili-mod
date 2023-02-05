import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter cost bilet:");
        int cost = input.nextInt();
        System.out.println("Cost bilet:" + cost);

        // closing the scanner object

        input.close();
        BonusMilesService call = new BonusMilesService();
        int calc_cb;
        calc_cb = call.calculate(cost);

        System.out.println("Your cashback:" + calc_cb);


    }
}