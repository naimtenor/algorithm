package org.naimtenor.al;

import java.util.Scanner;

/**
 * 사각형의 높이 n과 너비 m을 입력받은 후 사각형 내부에 지그재그 형태로 1부터 n*m번까지 숫자가 차례대로 출력되는 프로그램을
 * 작성하시오. < 처리조건 > 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 m만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.
 * 
 * 사각형의 높이n와 너비m( n과 m의 범위는 100 이하의 정수)을 입력받는다.
 * 
 * 위에서 형태의 직사각형을 입력에서 들어온 높이 n과 너비 m에 맞춰서 출력한다. 숫자 사이는 공백으로 구분한다.
 * 
 * 4 5
 * 
 * 1 2 3 4 5 
 * 10 9 8 7 6 
 * 11 12 13 14 15 
 * 20 19 18 17 16
 * 
 * @author naimtenor
 *
 */
public class NumberRectangleTwo1856 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		int number = 1;
		for (int i = 0 ; i < row ; i++) {
			String line = "";
			for (int j = 0 ; j < col ; j++) {
				if (i % 2 == 0) {
					line += (number + " ");
				} else {
					line = number + " " + line;
				}
				number++;
			}
			sb.append(line).append("\n");
		}
		
		System.out.println(sb.toString());
		
		scanner.close();
	}

}
