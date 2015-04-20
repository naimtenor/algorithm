package org.naimtenor.al;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 정사각형의 한 변의 길이 n을 입력받은 후 다음과 같은 문자로 된 정사각형 형태로 출력하는 프로그램을 작성하시오.
 * 
 * < 처리조건 > 문자의 진행 순서는 왼쪽 위에서부터 아래쪽으로 ‘A'부터 차례대로 채워나가고 다시 오론쪽 아래부터 위쪽으로 채워나가는
 * 방법으로 아래 표와 같이 채워 넣는다. 'Z' 다음에는 다시 'A'부터 반복된다.
 * 
 * 정사각형 한 변의 길이 n(n의 범위는 1이상 100 이하의 정수)을 입력받는다.
 * 
 * 위의 형식과 같이 한변의 길이가 n인 숫자 사각형을 출력한다. 숫자 사이는 공백으로 구분하여 출력한다
 * 
 * 4
 * 
 * A H I P 
 * B G J O 
 * C F K N 
 * D E L M
 * 
 * @author naimtenor
 *
 */
public class CharacterRectangleTwo1314 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		int alphabetCount = 65;
		String[] lines = new String[size];
		Arrays.fill(lines, "");

		for (int c = 0; c < size; c++) {
			int even = c % 2;

			switch (even) {
			case 0:
				for (int r = 0 ; r < size ; r++) {
					lines[r] += (char) alphabetCount + " ";
					if (alphabetCount == 90) {
						alphabetCount = 65;
					} else {
						alphabetCount++;
					}
				}
				break;
			case 1:
				for (int r = size - 1 ; r >= 0 ; r--) {
					lines[r] += (char) alphabetCount + " ";
					if (alphabetCount == 90) {
						alphabetCount = 65;
					} else {
						alphabetCount++;
					}
				}
				break;
			}
		}
		
		for (String line : lines) {
			System.out.println(line);
		}

		scanner.close();
	}

}
