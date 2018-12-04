

class Gameboard {
	public int cells[] = new int[15];		//Contains the gameboard
	public int count;						//Holds the number of full cells
	public boolean changed = false;			//Lets the solve function know if the gameboard changed
	public Move replay[] = new Move[1000];	//Holds the information about previous moves to get to the current state
	public int replayMoves = 0;				//Holds the amount of moves taken so far to get to the current state
	public int start;						//Holds the initial start state so the board can be reset once the solution is found
	
	//Basic Constructor (must have a start position)
	public Gameboard(int s) {
		for(int i = 0; i < 15; i++) {
			cells[i] = 1;
		}
		cells[s] = 0;
		count = 14;
		start = s;
	}
	
	//Copy constructor
	public Gameboard(Gameboard gb) {
		for(int i = 0; i < 15; i++) {
			cells[i] = gb.cells[i];
		}
		for(int i = 0; i < gb.replayMoves; i++) {
			replay[i] = gb.replay[i];
		}
		count = gb.count;
		replayMoves = gb.replayMoves;
		start = gb.start;
		changed = false;
	}
	
	public void resetGameboard() {
		for(int i = 0; i < 15; i++) {
			cells[i] = 1;
		}
		cells[start] = 0;
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