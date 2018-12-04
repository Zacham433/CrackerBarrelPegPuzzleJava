import java.io.*;


class PegPuzzle {

	public static void main(String[] args) {
		Moves ms = new Moves();
		Gameboard gb = new Gameboard(0);
		gb = solve(gb, ms);
		
		
	}
	
	public static Gameboard solve(Gameboard gb, Moves ms) {
		if(gb.count < 2) {
			return gb;
		}
		else {
			for(int i = 0; i < ms.count; i++) {
				Move temp = ms.getMove(i);
				gb.move(temp);
				if(gb.changed) {
					gb.print();
				}
				else {
					
				}
			}
			return gb;
		}
	}
}