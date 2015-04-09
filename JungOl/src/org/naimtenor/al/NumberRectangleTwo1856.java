package org.naimtenor.al;

import java.util.Scanner;

/**
 * �簢���� ���� n�� �ʺ� m�� �Է¹��� �� �簢�� ���ο� ������� ���·� 1���� n*m������ ���ڰ� ���ʴ�� ��µǴ� ���α׷���
 * �ۼ��Ͻÿ�. < ó������ > ������ ���� ������ ó���� ���ʿ��� ���������� �ʺ� m��ŭ ���� �� �� ������ �ٲپ �̸� �ݺ��Ѵ�.
 * 
 * �簢���� ����n�� �ʺ�m( n�� m�� ������ 100 ������ ����)�� �Է¹޴´�.
 * 
 * ������ ������ ���簢���� �Է¿��� ���� ���� n�� �ʺ� m�� ���缭 ����Ѵ�. ���� ���̴� �������� �����Ѵ�.
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
