package com.qa.assessment;

public class Movment {
	

	public int x = 0;
	public int y = 0;

	public int goNorth() {
		this.x = (x + 1);
		return x;
	}

	public int goSouth() {
		this.x = (x - 1);
		return x;
	}

	public int goEast() {
		this.y = (y + 1);
		return y;
	}

	public int goWest() {
		this.y = (y - 1);
		return y;
	}

}

