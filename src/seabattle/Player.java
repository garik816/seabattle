import java.util.Scanner;

public class Player {
	int shootX = 0;
	int shootY = 0;
	void getShot(){
        System.out.println("введите координаты (в виде A4, G0)");
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.printf("Вы ввели: %s\n", x);
        shootX = 0;
        char tmpX = x.charAt(0);
        char tmpY = x.charAt(1);
        if (tmpX > 64 && tmpX < 75) {
        	shootX = tmpX-64;
		}
        if (tmpX > 96 && tmpX < 107) {
        	shootX = tmpX-96;
		}
        else {
        	System.out.println("ERROR");
        	shootX = 0;
        	tmpY = 47;
        }
        shootY = tmpY-47;
        if (shootY > 10 || shootY < 0) {
        	System.out.println("Ahtung!");
        	shootX = 0;
        	shootY = 0;
		}
	}
}