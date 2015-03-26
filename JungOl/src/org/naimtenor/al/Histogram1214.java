package org.naimtenor.al;

import java.util.Arrays;
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
		
		long maxArea = 0L;
		
		int value = 0;
		int beforeValue = 0;
		int max = 0;
		
		for(int i = 0 ; i < size ; i++) {
			heights[i] = scanner.nextInt();
			max = max < heights[i] ? heights[i] : max;
		}
		System.out.println(max);
		int[] counts = new int[max];
		Arrays.fill(counts, 0);
		
		for(int i = 0 ; i < size ; i++) {
			value = heights[i];
			if (i != 0) {
				beforeValue = heights[i - 1];
			}			
			
			if (value >= beforeValue) {
				for (int j = 0 ; j < value ; j++) {
					counts[j] += 1;
				}
			} else {
				for (int j = 0 ; j < beforeValue ; j++) {
					if ( j < value) {
						counts[j] += 1;
					} else {
						long area = counts[j] * (j + 1);
						maxArea = maxArea < area ? area : maxArea;
						counts[j] = 0;
					}					
				}
			}
			
			beforeValue = value;
		}
		
		for (int i = 0 ; i < counts.length ; i++) {
			long area = counts[i] * (i + 1);
			maxArea = maxArea < area ? area : maxArea;
		}
		
		System.out.println(maxArea);
		
		scanner.close();
	}

}
