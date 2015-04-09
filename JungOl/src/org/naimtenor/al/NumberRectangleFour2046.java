package org.naimtenor.al;

import java.util.Scanner;

/**
 * ���簢���� �� ���� ���� n�� ���� m�� �Է¹��� �� ������ ���� ���簢�� ���·� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * < ó������ > ���� 2���� ��� ������ ���� ������ ó���� ���ʿ��� ���������� �ʺ� n��ŭ ���� �� �� ������ �ٲپ �̸� �ݺ��Ѵ�.
 * 
 * ���簢�� �� ���� ���� n(n�� ������ 100 ������ ����)�� ���� m(m�� 1���� 3������ ����)�� �Է¹޴´�.
 * 
 * ������ ����� 3���� ������ �Է¿��� �� ���� ���� n�� ���� m�� ���缭 ����Ѵ�. ���� ���̴� �������� �����Ͽ� ����Ѵ�.
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
