package org.naimtenor.al;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 
 * <pre>
 * KOI ��ſ����Ҵ� �������� �̿��� ���ο� ��� ��� �ý��� ������ ���� ������ �ϰ� �ִ�. 
 * ������ ���Ͽ� ������ ���� N���� ���̰� ���� �ٸ� ž�� ���� ������ ���ʺ��� ������ �������� ���ʷ� �����, 
 * �� ž�� ����⿡ ������ �۽ű⸦ ��ġ�Ͽ���. 
 * 
 * ��� ž�� ������ �۽ű�� ������ ��ȣ�� ��ǥ��� �����ϰ� ���� ������ ���� �������� �߻��ϰ�, 
 * ž�� ��� ��ο��� ������ ��ȣ�� �����ϴ� ��ġ�� ��ġ�Ǿ� �ִ�. 
 * �ϳ��� ž���� �߻�� ������ ��ȣ�� ���� ���� ������ �� �ϳ��� ž������ ������ �����ϴ�.
 * 
 * ���� ��� ���̰� 6, 9, 5, 7, 4�� �ټ� ���� ž�� ���� ������ �Ϸķ� �� �ְ�, 
 * ��� ž������ �־��� ž ������ �ݴ� ����(���� ����)���� ���ÿ� ������ ��ȣ�� �߻��Ѵٰ� ����. 
 * �׷���, ���̰� 4�� �ټ� ��° ž���� �߻��� ������ ��ȣ�� ���̰� 7�� �� ��° ž�� ������ �ϰ�, 
 * ���̰� 7�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž��, 
 * ���̰� 5�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž�� ������ �Ѵ�. 
 * ���̰� 9�� �� ��° ž�� ���̰� 6�� ù ��° ž�� ���� ������ ��ȣ�� � ž������ ������ ���� ���Ѵ�.
 * 
 * ž���� ���� N�� ž���� ���̰� �־��� ��, �� ���� ž���� �߻��� ������ ��ȣ�� ��� ž���� �����ϴ����� �˾Ƴ��� ���α׷��� �ۼ��϶�.
 * 
 * ù° �ٿ� ž�� ���� ��Ÿ���� ���� N�� �־�����. N�� 1 �̻� 500,000 �����̴�.
 * ��° �ٿ��� N���� ž���� ���̰� ������ ���� ������� �ϳ��� ��ĭ�� ���̿� �ΰ� �־�����.
 * ž���� ���̴� 1 �̻� 100,000,000 ������ �����̴�.
 * 
 * ù° �ٿ� �־��� ž���� ������� ������ ž�鿡�� �߻��� ������ ��ȣ�� ������ ž���� ��ȣ�� �ϳ��� ��ĭ�� ���̿� �ΰ� ����Ѵ�.
 * ���� ������ ��ȣ�� �����ϴ� ž�� �������� ������ 0�� ����Ѵ�.
 * 
 * 5
 * 6 9 5 7 4
 * 
 * 0 0 2 2 4
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class Tower1809 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] towers = new int[size];
		int[] indexes = new int[size];
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		LinkedList<Integer> indexStack = new LinkedList<Integer>();
		
		for (int i = 0; i < size; i++) {
			towers[i] = scanner.nextInt();
			indexes[i] = -1;
		}
		
		for (int i = 0; i < size; i++) {
			if (indexes[i] != -1) {
				continue;
			} else if (stack.isEmpty()) {
				stack.push(towers[i]);
				indexStack.push(i);
			} else {
				while (!stack.isEmpty() && stack.peek() < towers[i]) {
					stack.pop();
					indexStack.pop();
				}
				
				if (!stack.isEmpty()) {
					indexes[i] = indexStack.peek();
				}
				stack.push(towers[i]);
				indexStack.push(i);
			}
		}
		
		for (int index : indexes) {
			System.out.print(index + 1 + " ");
		}
		
		scanner.close();
	}

}
