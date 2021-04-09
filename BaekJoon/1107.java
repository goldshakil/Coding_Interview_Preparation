
import java.util.*;

import java.util.Map.Entry;

 class Main {

	static int bestSoFar = Integer.MAX_VALUE;

	 static void DFS(String pressedChannel, String channelNumber, Set<Integer> broken, int i) {
		//

//		System.out.println(pressedChannel);

		// check the generated result
		if (i > 0) // at least one character in pressed Channel
		{
			int curNumber = pressedChannel.length()
					+ Math.abs(Integer.valueOf(pressedChannel) - Integer.valueOf(channelNumber));

			bestSoFar = Math.min(bestSoFar, curNumber);

		}
		// stop if you went too far

		if (pressedChannel.length() > channelNumber.length()) { // above one digit okay // more than that useless
			return;
		}

		// check children
		else {
			// visit Children

			for (int number = 0; number <= 9; number++) // try all numbers
			{
				// try other number since temp was broken
				if (!broken.contains(number)) { // only not broken numbers
					char c = (char) (number + '0');
					pressedChannel += c;
					DFS(pressedChannel, channelNumber, broken, i + 1);
					pressedChannel = pressedChannel.substring(0, pressedChannel.length() - 1); // backtrack

				}

			}

		}

	}

	public static void main(String[] args) {

		int finalCounter = 0;

		Scanner sc = new Scanner(System.in);
		String channelNumber = sc.next();

		String pressedChannel = "";

		int counter = sc.nextInt();
		Set<Integer> broken = new HashSet<Integer>();
		for (int i = 0; i < counter; i++) {
			broken.add(sc.nextInt());
		}

		DFS(pressedChannel, channelNumber, broken, 0);

		int withOutNumber = Math.abs(Integer.valueOf(channelNumber) - 100);

		bestSoFar = Math.min(bestSoFar, withOutNumber);
		System.out.println(bestSoFar);

	}

}
