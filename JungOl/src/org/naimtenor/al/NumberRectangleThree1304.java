package org.naimtenor.al;

import java.util.Scanner;

/**
 * ���簢���� �� ���� ���� n�� �Է¹��� �� ������ ���� ���ڷ� �� ���簢�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. < ó������ > ������
 * ���� ������ ó���� ���� ������ �Ʒ������� n��ŭ ���� �� �� �ٷ� ������ ������ �ٽ� �Ʒ������� �����ϴ� ������� ���簢���� �� ������
 * �ݺ��Ѵ�.
 * 
 * ���簢�� �� ���� ���� n(n�� ������ 100 ������ �ڿ���)�� �Է¹޴´�.
 * 
 * ���� ���İ� ���� �� ���� ���̰� n�� ���� �簢���� ����Ѵ�. ���� ���̴� �������� �����Ͽ� ����Ѵ�.
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
