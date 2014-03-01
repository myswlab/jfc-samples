package it.unibs.ing.fp.math;

public class Pythagoras {

	public double hypotenuseFromCatheti(double cathetus1, double cathetus2) {
		return Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
	}
}
