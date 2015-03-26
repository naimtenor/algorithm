package org.naimtenor.al;

import java.util.Scanner;

/**
 * <pre>
 * 임의의 정수 N이 주어졌을 때 N의 양의 제곱근의 정수부분을 출력하는 프로그램을 작성하라. 
 * 양의 제곱근이란 다음을 만족하는 수 X 를 뜻한다.
 * 
 * N = X^2 (X≥0)
 *  
 * 주의 : sqrt와 같은 함수를 사용하지 말아야 하며 stdio.h 와 iostream 등 입출력 헤더에 있는 함수만이 사용가능한다. 이를 어길 경우 0점 처리를 한다.
 * 
 * 입력에는 2^63-1 이하의 양의 정수 N이 입력된다
 * 
 * N의 제곱근의 정수부분을 출력한다.
 * 
 * 8
 * 
 * 2
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class SquareRoot1240 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();

		long low = 0L;
		long high = number;
		long mid = 0L;

		while (low <= high) {
			mid = (high + low) / 2;
			
			mid = mid == 0 ? 1 : mid;
			
			long mm = mid * mid;
			long m1m1 = (mid + 1) * (mid + 1);
			
			if (mm <= 0 || mm > number) {
				high = mid - 1;
			} else if (number >= mm && (number < m1m1 || m1m1 <= 0)) {
				System.out.println(mid);
				break;
			} else {
				low = mid + 1;
			}
		}

		scanner.close();

	}

}
