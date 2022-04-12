package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> alice = new ArrayList<>();
		List<Integer> bob = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			alice.add(sc.nextInt());
		}
		
		for (int i = 0; i < 3; i++) {
			bob.add(sc.nextInt());
		}
		
		System.out.println(compareTriplets(alice, bob));
		
		sc.close();
	}

	private static List<Integer> compareTriplets(List<Integer> alice, List<Integer> bob) {
		
		int pointsAlice = 0;
		int pointsBob = 0;
		List<Integer> scores = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			if (alice.get(i) > bob.get(i)) {
				pointsAlice++;
			} else if (alice.get(i) < bob.get(i)) {
				pointsBob++;
			}
		}
		
		scores.add(pointsAlice);
		scores.add(pointsBob);
		
		return scores;
	}
}
