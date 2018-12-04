

class Gameboard {
	public int cells[] = new int[15];		//Contains the gameboard
	public int count;						//Holds the number of full cells
	public boolean changed = false;			//Lets the solve function know if the gameboard changed
	public Move replay[] = new Move[1000];
	public int replayMoves = 0;
	
	public Gameboard(int start) {
		for(int i = 0; i < 15; i++) {
			cells[i] = 1;
		}
		cells[start] = 0;
		count = 14;
	}
	
	public Gameboard(Gameboard gb) {
		for(int i = 0; i < 15; i++) {
			cells[i] = gb.cells[i];
		}
		for(int i = 0; i < gb.replayMoves; i++) {
			replay[i] = gb.replay[i];
		}
		count = gb.count;
		replayMoves = gb.replayMoves;
		changed = false;
	}
	
	public void move(Move m) {
		if(cells[m.from] == 1 && cells[m.over] == 1 && cells[m.to] == 0) {
			cells[m.from] = 0;
			cells[m.over] = 0;
			cells[m.to] = 1;
			count = count - 1;
			changed = true;
		}
		else {
			changed = false;
		}
	}
	
	public void print() {
		System.out.println("    " + cells[0]);
		System.out.println("   " + cells[1] + " " + cells[2]);
		System.out.println("  " + cells[3] + " " + cells[4] + " " + cells[5]);
		System.out.println(" " + cells[6] + " " + cells[7] + " " + cells[8] + " " + cells[9]);
		System.out.println(cells[10] + " " + cells[11] + " " + cells[12] + " " + cells[13] + " " + cells[14]);
		System.out.print("\n");
	}
	
	
}