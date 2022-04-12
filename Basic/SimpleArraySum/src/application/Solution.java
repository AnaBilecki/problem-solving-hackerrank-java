package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		List<Integer> array = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			array.add(sc.nextInt());
		}
		
		System.out.println(simpleArraySum(array));
		
		sc.close();
	}

	private static int simpleArraySum(List<Integer> array) {
		
		int sum = 0;
		
		for (Integer number : array) {
			sum += number;
		}
		
		return sum;
	}
}
