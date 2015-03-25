package org.naimtenor.al;

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
		
		int[] heights = new int[size];
		
		for (int i = 0; i < size; i++) {
			heights[i] = scanner.nextInt();
		}
		
		long maxArea = 0L;
		long tempMaxArea = 0L;
		boolean init = true;
		
		for (int i = 0; i < size; i++) {
			if (init) {
				maxArea = maxArea < heights[i] ? heights[i] : maxArea;
				tempMaxArea = heights[i];
				init = false;
			} else {
				if (heights[i - 1] > heights[i]) {
					maxArea = maxArea < tempMaxArea ? tempMaxArea : maxArea;
					init = true;
					tempMaxArea = 0L;
				} else {
					tempMaxArea += heights[i - 1];
				}
			}
		}
		
		System.out.println(maxArea);
		
		scanner.close();
	}

}
