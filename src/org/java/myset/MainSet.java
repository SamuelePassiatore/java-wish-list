package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args){
		
		Random random = new Random();
		Set<Integer> randomNumbers = new HashSet<>();

		while(randomNumbers.size() < 5) {
			randomNumbers.add(random.nextInt(2,13));
		}

		System.out.println(randomNumbers);
	}
}
