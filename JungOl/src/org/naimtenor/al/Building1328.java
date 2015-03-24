package org.naimtenor.al;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 <pre>
 * N개의 빌딩이 있다. 빌딩은 1번부터 N번까지 번호가 붙어 있다. 
 * 빌딩은 X좌표 상에 위치해 있으며 i번 빌딩은 i좌표 상에 위치해 있다. 
 * 그리고 각 빌딩은 Hi 만큼의 높이를 가지고 있다. i < j 이고 Hi < Hj 일 경우, i번 빌딩에서 j번 빌딩을 볼 수 있다. 
 * 각 빌딩에서 현재 빌딩의 좌표보다 뒤에 있는 빌딩을 보고자 할 때, 가장 앞에 보이는 빌딩이 어딘지 찾는 프로그램을 작성하라.
 * 
 * 입력의 첫 번째 줄에는 N이 입력된다(1≤N≤100,000).그리고 그 다음 줄부터는 Hi(1≤Hi≤1,000,000)가 순서대로 한 줄에 하나씩 입력된다.
 * 
 * 총 N개의 줄에 출력을 하게 되며, i번째 줄에는 i번 빌딩에서 보이는 가장 가까운 빌딩의 번호를 출력한다. 만약에 보이는 빌딩이 없을 경우에는 0을 출력한다.
 * 
 * 6 
 * 3 
 * 2 
 * 6 
 * 1 
 * 1 
 * 2
 * 
 * 3 
 * 3 
 * 0 
 * 6 
 * 6 
 * 0
 * </pre>
 * 
 * @author naimtenor
 *
 */
public class Building1328 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int size = Integer.parseInt(scanner.nextLine());
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		LinkedList<Integer> indexStack = new LinkedList<Integer>();
		
		int[] buildingArray = new int[size];
		int[] indexes = new int[size];

		for (int i = 0; i < size; i++) {
			buildingArray[i] = Integer.parseInt(scanner.nextLine());
			indexes[i] = -1;
		}
		
		for (int i = 0 ; i < size ; i++) {
			if (indexes[i] != -1) {
				continue;
			}
			if (stack.isEmpty()) {
				stack.push(buildingArray[i]);
				indexStack.push(i);
			} else if (buildingArray[i] <= stack.peek()) {
				stack.push(buildingArray[i]);
				indexStack.push(i);
			} else {
				while (!stack.isEmpty() && !(buildingArray[i] <= stack.peek())) {
					stack.pop();
					indexes[indexStack.peek()] = i + 1;
					indexStack.pop();
				}
				stack.push(buildingArray[i]);
				indexStack.push(i);
			}
		}
		
		for (int index : indexes) {
			System.out.println(index == -1 ? 0 : index);
		}
		
		scanner.close();
	}

}
