package com.epam.engx.cleancode.naming.task3;

public class H {

	// print some Harshad numbers
	public String main() {
		StringBuilder result = new StringBuilder();
		long l = 200; // limit the seq of Harshad numbers
		for (int i = 1; i <=l; i++) {
			if (i % loop(i) == 0) {
				result.append(i).append("\n");
			}
		}
		return result.toString();
	}

	private int loop(int n) {
		int s = 1;
		while (n != 0) {
            s += n % 10;
            n = n / 10;
        }
		return s;
	}

}
