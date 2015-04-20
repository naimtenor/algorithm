package org.naimtenor.al;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ���簢���� �� ���� ���� n�� �Է¹��� �� ������ ���� ���ڷ� �� ���簢�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * < ó������ > ������ ���� ������ �� ������ �Ʒ����� �������� 'A'���� ���ʴ�� ä�������� ������� �Ʒ� ǥ�� ���� ���� ������ ä��
 * �ִ´�. 'Z' �������� �ٽ� 'A'���� �ݺ��ȴ�.

 * ���簢�� �� ���� ���� n(n�� ������ 1�̻� 100 ������ ����)�� �Է¹޴´�.
 * 
 * ���� ���İ� ���� �Ѻ��� ���̰� n�� ���� �簢���� ����Ѵ�. ���� ���̴� �������� �����Ͽ� ����Ѵ�.
 * 
 * 4
 * 
 * P L H D 
 * O K G C 
 * N J F B 
 * M I E A
 * 
 * @author naimtenor
 *
 */
public class CharacterRectangleOne1307 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		String[] lines = new String[size];
		Arrays.fill(lines, "");
		
		int alphabetCount = 65;
		
		for (int c = size - 1 ; c >= 0 ; c--) {
			for (int r = size - 1 ; r >= 0 ; r--) {
				lines[r] = (char) alphabetCount + " " + lines[r];
				if (alphabetCount == 90) {
					alphabetCount = 65;
				} else {
					alphabetCount++;
				}
			}
		}
		
		for (String line : lines) {
			System.out.println(line);
		}
		scanner.close();
	}

}
