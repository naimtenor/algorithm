package org.naimtenor.al;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * <pre>
 * ������׷��̶� ���� ������ ������ �˱� ���� �簢���� ������ ���ؼ��� ���� �þ���� �ٰ����� ���Ѵ�. 
 * ���� ������ ������ 2, 1, 4, 5, 1, 3, 3�� ��� �簢���� �ʺ� 1�� ���߾� ������׷����� ����� ������ ����.
 * 
 * �츮�� �ϰ��� �ϴ� ���� ������ ������׷��� �־����� �� 
 * ������׷� ������ �簢������ �̷���� ���� ū ������ ũ�⸦ �˰��� �Ѵ�. 
 * ���� �� ������׷����� ���� ū �簢���� ������ �����ʿ� ������ ���� ������ ����
 * 
 * �Է� ù ��°�� ������׷��� �̷�� �簢���� ���� n(n��100,000)�� �Էµǰ� 
 * �� �ڷ� ������׷��� �̷�� �簢���� ���̰� ������� n�� �Է��� �ȴ�. 
 * �簢���� ���� k�� 0 �� k �� 1,000,000,000 �̴�. 
 * �簢���� �ʺ�� ��� 1�̴�.
 * 
 * �Էµ� ������׷����� ���� �� �ִ� �簢���� �ִ� ������ ����϶�.
 * 
 * 7 2 1 4 5 1 3 3
 * 
 * 8
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class Histogram1214 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		Map<Integer, Integer> heightsMap = new HashMap<Integer, Integer>();
		
		int max = 0;
		long maxArea = 0L;
		
		for(int i = 0 ; i < size ; i++) {
			int value = scanner.nextInt();
			max = max > value ? max : value;
			for (int j = 1 ; j <= max ; j++) {
				if (j <= value) {
					heightsMap.put(j, heightsMap.containsKey(j) ? heightsMap.get(j) + 1 : 1);
					maxArea = maxArea > heightsMap.get(j) * j ? maxArea : heightsMap.get(j) * j;
				} else {
					maxArea = maxArea > heightsMap.get(j) * j ? maxArea : heightsMap.get(j) * j;
					heightsMap.put(j, 0);
				}
			}
		}
		System.out.println(maxArea);
		
		scanner.close();
	}

}
