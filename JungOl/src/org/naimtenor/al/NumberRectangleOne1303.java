package org.naimtenor.al;

import java.util.Scanner;

/**
 * <pre>
 * �簢���� ���� n�� �ʺ� m�� �Է¹��� �� n�� m���� �簢�� ���·� 1���� n*m������ ���ڰ� ���ʴ�� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * < ó������ > 
 * ������ ���� ������ ó���� �� ������ ���ʿ��� ���������� 1���� ���ʴ�� �ʺ� m��ŭ ����� �� ���� �ٷ� �ٲپ �ٽ� ���ʿ��� ���������� 1�� �����ϸ鼭 ����ϴ� ������� n�� �ٱ��� �ݺ��Ѵ�.
 * 
 * �簢���� ����n�� �ʺ�m( n�� m�� ������ 100 ������ ����)�� �Է¹޴´�.
 * 
 * ������ ������ ���簢���� �Է¿��� ���� ���� n�� �ʺ� m�� ���缭 ����Ѵ�. ���� ���̴� �������� �����Ѵ�.
 * 
 * 4 5
 * 
 * 1 2 3 4 5 
 * 6 7 8 9 10
 * 11 12 13 14 15 
 * 16 17 18 19 20
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class NumberRectangleOne1303 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		int value = 1;
		for (int i = 0 ; i < row ; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0 ; j < col ; j++) {
				sb.append(value++).append(" ");
			}
			System.out.println(sb.toString());
		}
		
		scanner.close();
	}

}
