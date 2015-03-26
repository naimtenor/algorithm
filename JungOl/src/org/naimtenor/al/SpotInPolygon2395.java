package org.naimtenor.al;

import java.util.Scanner;

/**
 * <pre>
 * �ܼ� �ٰ����̶�, �����ϰų� �����ϱ⵵ �� �ٰ����̸�, 
 * �ٰ����� �̷�� ���̳� ���� ���� �������� �ʴ� �ٰ����� ���Ѵ�.
 * 
 * 2���� ��� ��ǥ �󿡼� ������ �� �� (X,Y)�� �ܼ� �ٰ����� �̷�� ���������� �־����� ��, 
 * (X,Y)�� �ٰ��� �ȿ� ���� �Ǿ��°� �ƴѰ� Ȥ�� �ٰ����� �̷�� ���п� ���ƴ°��� �Ǻ��ϴ� ���α׷��� �ۼ��϶�.
 * 
 * ������ �����ϰ� �ϱ� ���ؼ� �ٰ����� �̷�� ��� ���� ��ǥ �࿡ ���� Ȥ�� �����ϸ�, 
 * �ٰ����� �̷�� �������� ��ǥ�� ��� ���� ��ǥ�̴�. 
 * �Էµ� �ٰ����� ���������� �Էµ� �������� �����ϰ�, i��°�� �Էµ� �������� i+1��°�� �Էµ� �������� �մ� ������ �����ϸ�, 
 * ������ �������� �� �տ� �Էµ� �������� �̾��� �ִ�.
 * 
 * �Է��� ó������ �ٰ����� �̷�� �������� ������ ���ϴ� ���� N(4��N��50)�� �Էµȴ�. 
 * �� ���� �ٺ��� N���� �ٿ��� �ٰ����� �̷�� �������� ��ġ�� �ǹ��ϴ� x, y�� �Էµȴ�. 
 * x�� y�� -1,000�̻� 1,000������ ������.
 * 
 * ������ �ٿ��� ��ġ�� �Ǻ��ϱ� ���� ���� ��ǥ X�� Y�� �Էµȴ�.
 * 
 * �Է¿� ���ؼ� (X,Y)�� �ٰ����� ���ο� ��ġ�Ͽ��� ��쿡�� "INTERIOR"��, 
 * �ܺο� ��ġ���� ��쿡�� "EXTERIOR"��, 
 * �ٰ����� ��(Ȥ�� ��輱)�� ��ġ���� ��쿡�� "BOUNDARY"�� ����Ѵ�(�ֵ���ǥ �����Ͽ� ���).
 * 
 * 4
 * 0 0
 * 0 10
 * 10 10
 * 10 0
 * 5 5
 * 
 * INTERIOR
 * 
 * 12
 * 0 0
 * 0 1000
 * 1000 1000
 * 1000 800
 * 200 800
 * 200 600
 * 600 600
 * 600 400
 * 200 400
 * 200 200
 * 1000 200
 * 1000 0
 * 100 500
 * 
 * INTERIOR
 * 
 * 4
 * 0 0 
 * 0 10
 * 10 10
 * 10 0
 * 5 10
 * 
 * BOUNDARY
 * 
 * 4
 * 0 0
 * 0 10
 * 10 10
 * 10 0
 * 10 15
 * 
 * EXTERIOR
 * </pre>
 * 
 * @author mhwise.kim
 *
 */
public class SpotInPolygon2395 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] xs = new int[size];
		int[] ys = new int[size];

		for (int i  = 0 ; i < size ; i++) {
			xs[i] = scanner.nextInt();
			ys[i] = scanner.nextInt();
		}
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		boolean isXIn = false;
		boolean isYIn = false;
		
		for (int i  = 1 ; i < size ; i++) {
			if (x >= xs[i - 1] && x <= xs[i]) {
				isXIn = true;
			}
			if (y >= ys[i - 1] && y <= ys[i]) {
				isYIn = true;
			}
		}
		
		scanner.close();
	}

}