package org.naimtenor.al;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 * �Է����� �־��� �ڿ������� �������� �Ǵ� ������������ �����Ͽ� ����Ͽ�����.
 * 
 * ù �ٿ� N�� �־�����. N�� �־����� ����� ���̴�. (1��N��50,000)
 * ���Ĺ�� C�� �־�����. C���� 0�̸� ��������, 1�̸� ������������ ����ؾ��Ѵ�.
 * N���� �ڿ����� �־�����. �� �ڿ����� 10�� ������ ���̴�.
 * 
 * ������ ������ ����Ѵ�.
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
