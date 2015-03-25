package org.naimtenor.al;

import java.util.Scanner;

/**
 * 
 * <pre>
 * 히스토그램이란 보통 분포의 정도를 알기 위해 사각형의 서열을 기준선에 맞춰 늘어놓은 다각형을 말한다. 
 * 만약 임의의 수열이 2, 1, 4, 5, 1, 3, 3일 경우 사각형의 너비를 1로 맞추어 히스토그램으로 만들면 다음과 같다.
 * 
 * 우리가 하고자 하는 것은 임의의 히스토그램이 주어졌을 때 
 * 히스토그램 내에서 사각형으로 이루어진 가장 큰 면적의 크기를 알고자 한다. 
 * 왼쪽 의 히스토그램에서 가장 큰 사각형의 영역은 오른쪽에 밑줄이 쳐진 영역과 같다
 * 
 * 입력 첫 번째는 히스토그램을 이루는 사각형의 개수 n(n≤100,000)이 입력되고 
 * 그 뒤로 히스토그램을 이루는 사각형의 높이가 순서대로 n개 입력이 된다. 
 * 사각형의 높이 k는 0 ≤ k ≤ 1,000,000,000 이다. 
 * 사각형의 너비는 모두 1이다.
 * 
 * 입력된 히스토그램으로 만들 수 있는 사각형의 최대 면적을 출력하라.
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
