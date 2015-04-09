package org.naimtenor.al;

import java.util.Scanner;

/**
 * 정사각형의 한 변의 길이 n과 종류 m을 입력받은 후 다음과 같은 정사각형 형태로 출력하는 프로그램을 작성하시오.
 * < 처리조건 > 종류 2번의 경우 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 n만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.
 * 
 * 정사각형 한 변의 길이 n(n의 범위는 100 이하의 정수)과 종류 m(m은 1부터 3사이의 정수)을 입력받는다.
 * 
 * 위에서 언급한 3가지 종류를 입력에서 한 변의 길이 n과 종류 m에 맞춰서 출력한다. 숫자 사이는 공백으로 구분하여 출력한다.
 * 
 * 3 2
 * 
 * 1 2 3
 * 3 2 1
 * 1 2 3
 * 
 * 4 3
 * 
 * 1 2 3 4 
 * 2 4 6 8 
 * 3 6 9 12 
 * 4 8 12 16
 * 
 * @author naimtenor
 *
 */
public class NumberRectangleFour2046 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		int type = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder();

		switch (type) {
		case 1:
			for (int i = 0 ; i < size ; i++) {
				for (int j = 0 ; j < size ; j++) {
					sb.append(i + 1).append(" ");
				}
				sb.append("\n");
			}
			break;
		case 2:
			for (int i = 0 ; i < size ; i++) {
				for (int j = 0 ; j < size ; j++) {
					if (i % 2 == 0) {
						sb.append(j + 1).append(" ");
					} else {
						sb.append(size - j).append(" ");
					}
				}
				sb.append("\n");
			}
			break;
		case 3:
			for (int i = 0 ; i < size ; i++) {
				for (int j = 0 ; j < size ; j++) {
					sb.append((i + 1) * (j + 1)).append(" ");
				}
				sb.append("\n");
			}
			break;
		default:

		}
		
		System.out.println(sb.toString());
		scanner.close();
	}

}
