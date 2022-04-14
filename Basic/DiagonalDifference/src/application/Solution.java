package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<List<Integer>> array = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				list.add(sc.nextInt());
			}
			array.add(list);
		}
		
		System.out.println(diagonalDifference(array));
		
		sc.close();
	}

	private static int diagonalDifference(List<List<Integer>> array) {
		
		int rightSum = 0;
        int leftSum = 0;
        
        for(int i = 0; i < array.size(); i++) {
            leftSum += array.get(i).get(i);
            rightSum += array.get(i).get(array.size() - (1 + i));
        }
        
        return Math.abs(leftSum - rightSum);

	}
}
