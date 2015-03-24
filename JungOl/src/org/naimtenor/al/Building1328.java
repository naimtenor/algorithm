package org.naimtenor.al;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 <pre>
 * N���� ������ �ִ�. ������ 1������ N������ ��ȣ�� �پ� �ִ�. 
 * ������ X��ǥ �� ��ġ�� ������ i�� ������ i��ǥ �� ��ġ�� �ִ�. 
 * �׸��� �� ������ Hi ��ŭ�� ���̸� ������ �ִ�. i < j �̰� Hi < Hj �� ���, i�� �������� j�� ������ �� �� �ִ�. 
 * �� �������� ���� ������ ��ǥ���� �ڿ� �ִ� ������ ������ �� ��, ���� �տ� ���̴� ������ ����� ã�� ���α׷��� �ۼ��϶�.
 * 
 * �Է��� ù ��° �ٿ��� N�� �Էµȴ�(1��N��100,000).�׸��� �� ���� �ٺ��ʹ� Hi(1��Hi��1,000,000)�� ������� �� �ٿ� �ϳ��� �Էµȴ�.
 * 
 * �� N���� �ٿ� ����� �ϰ� �Ǹ�, i��° �ٿ��� i�� �������� ���̴� ���� ����� ������ ��ȣ�� ����Ѵ�. ���࿡ ���̴� ������ ���� ��쿡�� 0�� ����Ѵ�.
 * 
 * 6 
 * 3 
 * 2 
 * 6 
 * 1 
 * 1 
 * 2
 * 
 * 3 
 * 3 
 * 0 
 * 6 
 * 6 
 * 0
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class Building1328 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int size = Integer.parseInt(scanner.nextLine());
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		LinkedList<Integer> indexStack = new LinkedList<Integer>();
		
		int[] buildingArray = new int[size];
		int[] indexes = new int[size];

		for (int i = 0; i < size; i++) {
			buildingArray[i] = Integer.parseInt(scanner.nextLine());
			indexes[i] = -1;
		}
		
		for (int i = 0 ; i < size ; i++) {
			if (indexes[i] != -1) {
				continue;
			}
			if (stack.isEmpty()) {
				stack.push(buildingArray[i]);
				indexStack.push(i);
			} else if (buildingArray[i] <= stack.peek()) {
				stack.push(buildingArray[i]);
				indexStack.push(i);
			} else {
				while (!stack.isEmpty() && !(buildingArray[i] <= stack.peek())) {
					stack.pop();
					indexes[indexStack.peek()] = i + 1;
					indexStack.pop();
				}
				stack.push(buildingArray[i]);
				indexStack.push(i);
			}
		}
		
		for (int index : indexes) {
			System.out.println(index == -1 ? 0 : index);
		}
		
		scanner.close();
	}

}
