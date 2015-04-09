package org.naimtenor.al;

import java.util.Scanner;

/**
 * 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같이 숫자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오. < 처리조건 > 숫자의
 * 진행 순서는 처음에 왼쪽 위에서 아래쪽으로 n만큼 진행 한 후 바로 오른쪽 위에서 다시 아래쪽으로 진행하는 방법으로 정사각형이 될 때까지
 * 반복한다.
 * 
 * 정사각형 한 변의 길이 n(n의 범위는 100 이하의 자연수)을 입력받는다.
 * 
 * 위의 형식과 같이 한 변의 길이가 n인 숫자 사각형을 출력한다. 숫자 사이는 공백으로 구분하여 출력한다.
 * 
 * 4
 * 
 * 1 5 9 13 
 * 2 6 10 14 
 * 3 7 11 15 
 * 4 8 12 16
 * 
 * @author naimtenor
 *
 */
public class NumberRectangleThree1304 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++) {
			for (int j = 0 ; j < size ; j++) {
				sb.append(i + 1 + (j * size)).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());

		scanner.close();
	}

}
