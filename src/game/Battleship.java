package game;

public class Battleship {
	public static void main(String[] args) {
		boolean replay;
		Game.launch2players();
		do {
			replay = Game.shot();
			if(!replay) {
				System.out.println("Rat� !");
				Game.changeCurrentPlayer();
			}else if(Game.isOver()==true) {
				System.out.println(" Bravo vous avez gagner");
			}
			else {
				System.out.println("Touch� ! Vous pouvez rejouer.");
			}
		}while(!Game.isOver());
	}
}
