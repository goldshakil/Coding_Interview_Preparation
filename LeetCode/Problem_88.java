class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int merged_array[] = Arrays.copyOf(nums1, nums1.length); // new array

		// store at nums1
		int idx1 = 0; // merged
		int idx2 = 0; // nums2
		int k = 0; // nums1
		while (idx1 < m && idx2 < n) {
			if (merged_array[idx1] < nums2[idx2]) {
				nums1[k] = merged_array[idx1];
				idx1++;
			} else {
				nums1[k] = nums2[idx2];
				idx2++;
			}

			k++;
		}
		while (idx1 < m) {
			nums1[k] = merged_array[idx1];
			idx1++;
			k++;
		}
		while (idx2 < n) {
			nums1[k] = nums2[idx2];
			idx2++;
			k++;
		}

	}
}
