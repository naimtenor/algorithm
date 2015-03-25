package org.naimtenor.al;

import java.util.HashMap;
import java.util.Map;
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
