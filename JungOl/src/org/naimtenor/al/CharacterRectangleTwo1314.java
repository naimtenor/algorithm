package org.naimtenor.al;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���簢���� �� ���� ���� n�� �Է¹��� �� ������ ���� ���ڷ� �� ���簢�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * < ó������ > ������ ���� ������ ���� ���������� �Ʒ������� ��A'���� ���ʴ�� ä�������� �ٽ� ������ �Ʒ����� �������� ä��������
 * ������� �Ʒ� ǥ�� ���� ä�� �ִ´�. 'Z' �������� �ٽ� 'A'���� �ݺ��ȴ�.
 * 
 * ���簢�� �� ���� ���� n(n�� ������ 1�̻� 100 ������ ����)�� �Է¹޴´�.
 * 
 * ���� ���İ� ���� �Ѻ��� ���̰� n�� ���� �簢���� ����Ѵ�. ���� ���̴� �������� �����Ͽ� ����Ѵ�
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
