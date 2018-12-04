import java.io.*;
import java.util.*;


class PegPuzzle {

	public static void main(String[] args) {
		Moves ms = new Moves();
		Move replay[] = new Move[1000];
		Gameboard gb = new Gameboard(0);
		test(gb, ms);
		
		
		
	}
	
	public static Gameboard solve(Gameboard gb, Moves ms, Move[] replay) {
		gb.print();
		int count = 0;
		if(gb.count < 2) {
			System.out.println("Completed Puzzle");
			replay[count + 1] = null;
			gb.replay = replay;
			return gb;
		}
		else {
			for(int i = 0; i < ms.count; i++) {
				Move temp = ms.getMove(i);
				Gameboard gbnew = move(gb, temp);
				if(gbnew.changed) {
					replay[count] = temp;
					gbnew = solve(gbnew, ms, replay);
					return gbnew;
				}
			}
			return gb;
		}
	}
	
	public static Gameboard move(Gameboard gb, Move m) {
		if(gb.cells[m.from] == 1 && gb.cells[m.over] == 1 && gb.cells[m.to] == 0) {
			gb.cells[m.from] = 0;
			gb.cells[m.over] = 0;
			gb.cells[m.to] = 1;
			gb.count = gb.count - 1;
			gb.changed = true;
			return gb;
		}
		else {
			gb.changed = false;
			return gb;
		}
	}
	
	public static void test(Gameboard gb, Moves ms) {
		for(int i = 0; i < ms.count; i++) {
			Gameboard gbnew = new Gameboard(gb);
			Move temp = ms.getMove(i);
			gbnew = move(gbnew, temp);
			if(gbnew.changed) {
				gbnew.print();
				if(gbnew.count < 2) {
					System.exit(0);
				}
				test(gbnew, ms);
			}
		}
	}
}