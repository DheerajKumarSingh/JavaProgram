package test.logical;

import java.util.Set;
import java.util.TreeSet;

public class FindDublicateElement {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	//	methodOneSquare();
	//	methodTwoUsingSet();
		methodThree();
	}

	private static void methodThree() {
		// TODO Auto-generated method stub
		
		
	}

	private static void methodTwoUsingSet() {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 4, 2, 4, 5, 6, 4, 5, 5, 5 };

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.add(arr[i])) {
				System.out.print("" + arr[i]);
			}
		}
		for (Integer integer : set) {
			System.out.print("\n value:" + integer);
		}

	}

	private static void methodOneSquare() {
		// TODO Auto-generated method stub

		int arr[] = { 1, 3, 4, 2, 4, 5, 6, 4, 5, 5, 5 };
		int result[] = new int[arr.length];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print("\n position dublicate is :value" + arr[i]);
				} else {
					count++;
					result[i] = arr[i];
				}
			}
		}

		for (int k = 0; k < count; k++) {
			System.out.print("" + result[k]);
		}
	}

}
