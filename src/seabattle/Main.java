public class Main {
	 public static void main(String[] args) {
		 Field field = new Field();
		 Player player = new Player();
		 Ship ship = new Ship(4,4);
		 field.init();
		 field.setShip(ship);
		 System.out.println("starnig game");
		 do {
			field.show();
			player.getShot();
			field.doShoot(player.shootX, player.shootY);
		} while (field.isNotGameOver());
	 }
}