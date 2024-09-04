package collection;

import java.util.*;

public class printingvaluessingiterator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the value");
		int n = s.nextInt();
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			System.out.print("enter the value");
			int a = s.nextInt();
			data.add(a);
		}

			
				System.out.println(data);
				Iterator itr = data.iterator();
				while (itr.hasNext()) {
					int i = (int) itr.next();
					System.out.println(i);
				}
			}

		}

	


