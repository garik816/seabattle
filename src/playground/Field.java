
public class Field {
	final int SIZE = 11;
	char[][] cells = new char[SIZE][SIZE];
	Ship ship;

	void init(){
        for (int i = 0; i < cells.length; i++) {
        	for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
			}
        }

        char bar = 47;
        for (int i = 1; i < cells.length; i++) {
        	cells[0][i]=(char) (bar+i);
		}
        bar = 64;
        for (int i = 1; i < cells.length; i++) {
        	cells[i][0]=(char) (bar+i);
		}
	}   
        
    void setShip(Ship ship){
    	this.ship = ship;
    	cells[ship.positionX][ship.positionY] = 'X';     
	}
    
    void doShoot(int shootX, int shootY){
        switch (cells[shootX][shootY]) {
        case '.':
            System.out.println("Промах");
            cells[shootX][shootY] = '*';
            break;
        case 'X':
            System.out.println("корабль потоплен");
            cells[shootX][shootY] = 'W';
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    System.out.print(cells[j][i]);
                    System.out.print(" ");
                }
                System.out.println();
            }                                        
            break;
        case '*':
            System.out.println("уже стрелял!");
            break;
        default:
            System.out.println("ERROR");
            }
        }
    void show(){
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(cells[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    boolean isNotGameOver(){
    	return cells[ship.positionX][ship.positionY] == 'X';
    }
}
