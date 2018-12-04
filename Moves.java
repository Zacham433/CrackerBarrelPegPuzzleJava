class Moves {
	public Move moves[] = new Move[18];
	public int count;
	
	public Moves() {
		moves[0] = new Move(0,1,3);
		moves[1] = new Move(0,2,5);
		moves[2] = new Move(1,3,6);
		moves[3] = new Move(1,4,8);
		moves[4] = new Move(2,4,7);
		moves[5] = new Move(2,5,9);
		moves[6] = new Move(3,6,10);
		moves[7] = new Move(3,7,12);
		moves[8] = new Move(4,7,11);
		moves[9] = new Move(4,8,13);
		moves[10] = new Move(5,8,12);
		moves[11] = new Move(5,9,14);
		moves[12] = new Move(3,4,5);
		moves[13] = new Move(6,7,8);
		moves[14] = new Move(7,8,9);
		moves[15] = new Move(10,11,12);
		moves[16] = new Move(11,12,13);
		moves[17] = new Move(12,13,14);
		count = 18;
	}
	
	public Move getMove(int i) {
		return moves[i];
	}
}