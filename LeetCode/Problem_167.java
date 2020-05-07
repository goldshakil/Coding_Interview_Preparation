class Solution {
	public int[] twoSum(int[] numbers, int target) {

		int i = 0;
		int j = numbers.length - 1;
		int answer[] = new int[2];

		while (i < j) {
			if (numbers[j] + numbers[i] == target) {
				answer[0] = i + 1;
				answer[1] = j + 1;
				return answer;

			} else if (numbers[j] + numbers[i] > target) {
				j--;

			} else if (numbers[j] + numbers[i] < target) {
				i++;

			}

		}

		return answer;

	}
}
