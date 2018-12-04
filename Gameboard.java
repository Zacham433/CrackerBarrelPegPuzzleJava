

class Gameboard {
	public int cells[] = new int[15];		//Contains the gameboard
	public int count;						//Holds the number of full cells
	
	public Gameboard(int start) {
		for(int i = 0; i < 15; i++) {
			cells[i] = 1;
		}
		cells[start] = 0;
	}
	
	public void move(Move m) {
		if(cells[m.from] == 1 && cells[m.over] == 1 && cells[m.to] == 0) {
			cells[m.from] = 0;
			cells[m.over] = 0;
			cells[m.to] = 1;
			count = count - 1;
		}
	}
	
	public void print() {
		for(int i = 0; i < 15; i++) {
			System.out.println(cells[i]);
		}
	}
	
	
}