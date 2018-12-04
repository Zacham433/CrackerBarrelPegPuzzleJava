

class Move{
	
	public int from;
	public int over;
	public int to;
	
	public Move(int a, int b, int c) {
		from = a;
		over = b;
		to = c;
	}

	public void print() {
		System.out.println("(" + from + ", " + over + ", " + to + ")");
	}

}