import java.io.*;
import java.util.*;


class PegPuzzle {

	public static void main(String[] args) {
		Moves ms = new Moves();
		Gameboard gb = new Gameboard(6);
		solve(gb, ms);
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
	
	public static void solve(Gameboard gb, Moves ms) {
		for(int i = 0; i < ms.count; i++) {
			Gameboard gbnew = new Gameboard(gb);
			Move temp = ms.getMove(i);
			gbnew = move(gbnew, temp);
			if(gbnew.changed) {
				gbnew.replay[gbnew.replayMoves] = temp;
				gbnew.replayMoves = gbnew.replayMoves + 1;
				if(gbnew.count < 2) {
					for(int j = 0; j < gbnew.replayMoves; j++) {
						gbnew.replay[j].print();
					}
					printSolution(gbnew);
				}
				solve(gbnew, ms);
			}
		}
	}
	
	public static void printSolution(Gameboard gb) {
		gb.resetGameboard();
		gb.print();
		for(int i = 0; i < gb.replayMoves; i++) {
			gb = move(gb, gb.replay[i]);
			gb.print();
		}
		System.exit(0);
	}
}