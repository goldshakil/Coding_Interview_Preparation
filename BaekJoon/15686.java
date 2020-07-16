import java.util.*;

class Main {

	static int minSum = Integer.MAX_VALUE;

	static void findSum(List<point> chosen, List<point> houses) {

		int sum = 0;
		for (int i = 0; i < houses.size(); i++) {
			point house = houses.get(i);
			int houseSum = Integer.MAX_VALUE;
			for (int j = 0; j < chosen.size(); j++) { //for every house go throuh all chicken
				point chicken = chosen.get(j);
				houseSum = Math.min(houseSum, (Math.abs(house.x - chicken.x) + Math.abs(house.y - chicken.y)));

			} // find house sum

			sum += houseSum;
			if(sum>minSum)
				return;
		}

		minSum = Math.min(sum, minSum);

	}

	static void DFS(int left,int count, int m, List<point> chosen, List<point> houses, List<point> chickens) {
		if (count > m) // at max we can choose m
		{
			return;
		} else {
			if (count == m) {
				findSum(chosen, houses);
                return;
			}

			for (int i = left; i < chickens.size(); i++) {
				point temp = chickens.get(i);
				// add to chosen
				chosen.add(temp);
				// remove ftom chickens
				
				DFS(i+1,count + 1, m, chosen, houses, chickens);
				// add to chickens
				
				chosen.remove(chosen.size() - 1);

			}
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt(); // maximum chicken houses I can select
		List<point> houses = new ArrayList<point>();

		List<point> chickens = new ArrayList<point>();

		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				if (arr[i][j] == 1) {

					point temp = new point();
					temp.x = i + 1;
					temp.y = j + 1;
					houses.add(temp);

				} else if (arr[i][j] == 2) {
					point temp = new point();
					temp.x = i + 1;
					temp.y = j + 1;
					chickens.add(temp);

				}

			}
		}

		List<point> chosen = new ArrayList<point>();

		DFS(0,0, m, chosen, houses, chickens);

		System.out.println(minSum);

		sc.close();

	}

}

class point {
	int x;
	int y;

}
