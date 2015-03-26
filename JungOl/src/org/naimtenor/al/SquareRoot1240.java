package org.naimtenor.al;

import java.util.Scanner;

/**
 * <pre>
 * ������ ���� N�� �־����� �� N�� ���� �������� �����κ��� ����ϴ� ���α׷��� �ۼ��϶�. 
 * ���� �������̶� ������ �����ϴ� �� X �� ���Ѵ�.
 * 
 * N = X^2 (X��0)
 *  
 * ���� : sqrt�� ���� �Լ��� ������� ���ƾ� �ϸ� stdio.h �� iostream �� ����� ����� �ִ� �Լ����� ��밡���Ѵ�. �̸� ��� ��� 0�� ó���� �Ѵ�.
 * 
 * �Է¿��� 2^63-1 ������ ���� ���� N�� �Էµȴ�
 * 
 * N�� �������� �����κ��� ����Ѵ�.
 * 
 * 8
 * 
 * 2
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class SquareRoot1240 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();

		long low = 0L;
		long high = number;
		long mid = 0L;

		while (low <= high) {
			mid = (high + low) / 2;
			
			mid = mid == 0 ? 1 : mid;
			
			long mm = mid * mid;
			long m1m1 = (mid + 1) * (mid + 1);
			
			if (mm <= 0 || mm > number) {
				high = mid - 1;
			} else if (number >= mm && (number < m1m1 || m1m1 <= 0)) {
				System.out.println(mid);
				break;
			} else {
				low = mid + 1;
			}
		}

		scanner.close();

	}

}
