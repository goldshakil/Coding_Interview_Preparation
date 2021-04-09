import java.util.*;
 class Main {
	static int K = 0;

	 static int finalAns = Integer.MIN_VALUE;

	 static boolean visit[] = new boolean[26]; // which has been used

	 static int count(List<String> list) {

		int num = 0;
		for (int i = 0; i < list.size(); i++) {
			boolean flag = true;
			for (int j = 0; j < list.get(i).length(); j++) {

				if (!visit[list.get(i).charAt(j) - 97]) {
					flag = false;
					break;
				}
			}
			if (flag)
				num++;
		}

//		System.out.println("---------------");
		return num;

	}

	 static void DFS(int count, int start, List<String> list) {

		if (count >= K) {
			// System.out.println(set);
			int readable = count(list);

			finalAns = Math.max(finalAns, readable);

			return;

		}

		else {

			for (int i = start; i < 26; i++) {

				if (!visit[i]) {

					visit[i] = true;

					DFS(count + 1, i, list);

					visit[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int words = sc.nextInt();
		int letters = sc.nextInt();
		if (letters < 5) {
			System.out.println("0");

		}

		else if (letters == 26) {
			System.out.println(words);

		}

		else {

			List<String> list = new ArrayList<String>();

			for (int i = 0; i < words; i++) {
				String temp = "";
				temp = sc.next();
				temp = temp.substring(4, temp.length() - 4);
				list.add(temp);

			}

			visit['a' - 97] = true; // 0
			visit['n' - 97] = true; //
			visit['t' - 97] = true;
			visit['i' - 97] = true;
			visit['c' - 97] = true;

//			System.out.println(list);

			// System.out.println(list);

			K = letters - 5;

			DFS(0, 0, list);
			System.out.println(finalAns);
			sc.close();

		}
	}

}
