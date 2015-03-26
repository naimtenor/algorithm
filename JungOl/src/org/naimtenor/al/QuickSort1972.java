package org.naimtenor.al;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 * 입력으로 주어진 자연수들을 오름차순 또는 내림차순으로 정렬하여 출력하여보자.
 * 
 * 첫 줄에 N이 주어진다. N은 주어지는 명령의 수이다. (1≤N≤50,000)
 * 정렬방법 C가 주어진다. C값이 0이면 오름차순, 1이면 내림차순으로 출력해야한다.
 * N개의 자연수가 주어진다. 각 자연수는 10억 이하의 수이다.
 * 
 * 정렬한 수들을 출력한다.
 * 
 * 5
 * 0
 * 9
 * 2
 * 5
 * 1
 * 100
 * 
 * 1
 * 2
 * 5
 * 9
 * 100
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class QuickSort1972 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		final int method = scanner.nextInt() == 0 ? 1 : -1;
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0 ; i < size ; i++) {
			numbers.add(scanner.nextInt());
		}
		
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return method * o1.compareTo(o2);
			}
			
		});
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		scanner.close();
	}

}
