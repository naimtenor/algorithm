package org.naimtenor.al;

import java.util.Scanner;

/**
 * <pre>
 * 단순 다각형이란, 볼록하거나 오목하기도 한 다각형이며, 
 * 다각형을 이루는 선이나 변이 서로 교차하지 않는 다각형을 뜻한다.
 * 
 * 2차원 평면 좌표 상에서 임의의 한 점 (X,Y)와 단순 다각형을 이루는 꼭지점들이 주어졌을 때, 
 * (X,Y)가 다각형 안에 포함 되었는가 아닌가 혹은 다각형을 이루는 선분에 걸쳤는가를 판별하는 프로그램을 작성하라.
 * 
 * 문제를 간단하게 하기 위해서 다각형을 이루는 모든 변은 좌표 축에 수직 혹은 수평하며, 
 * 다각형을 이루는 꼭지점의 좌표는 모두 정수 좌표이다. 
 * 입력된 다각형은 마지막으로 입력된 꼭지점을 제외하고, i번째로 입력된 꼭지점과 i+1번째로 입력된 꼭지점을 잇는 직선이 존재하며, 
 * 마지막 꼭지점은 맨 앞에 입력된 꼭지점과 이어져 있다.
 * 
 * 입력의 처음에는 다각형을 이루는 꼭지점의 개수를 뜻하는 정수 N(4≤N≤50)이 입력된다. 
 * 그 다음 줄부터 N개의 줄에는 다각형을 이루는 꼭지점의 위치를 의미하는 x, y가 입력된다. 
 * x와 y는 -1,000이상 1,000이하의 정수다.
 * 
 * 마지막 줄에는 위치를 판별하기 위한 점의 좌표 X와 Y가 입력된다.
 * 
 * 입력에 대해서 (X,Y)가 다각형의 내부에 위치하였을 경우에는 "INTERIOR"를, 
 * 외부에 위치했을 경우에는 "EXTERIOR"를, 
 * 다각형의 변(혹은 경계선)에 위치했을 경우에는 "BOUNDARY"를 출력한다(쌍따옴표 제외하여 출력).
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
