class Solution {
    
    //way easier solutions exist..
    
    public  void shifter(int a[], int shifterCount, int replacedIdx, int replacingIdx) {

		for (int i = replacedIdx; i < a.length && replacingIdx < a.length; i++) {
			a[i] = a[replacingIdx];
			replacingIdx++;
		}

	}
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        
        int lastNumber = nums[0];
		int count = 1;
		int finalCount = 0;
		int shifted=0;

		for (int i = 1; i < nums.length-shifted; i++) {
			//System.out.println(nums[i]);
			if (nums[i] == lastNumber) {
				count++;
			} else {
				// found new number
				if (count >= 3) {
					finalCount += 2;
					int shiftingCounter = count - 2;
					shifted+=shiftingCounter;
					int replacedIdx = i - shiftingCounter;
					shifter(nums, shiftingCounter, replacedIdx, i);
					i-=shiftingCounter;
					
					//System.out.println(Arrays.toString(nums));
				} else {
					// no need for shifting
					finalCount += count;
				}
				//System.out.println("Last Number:" + lastNumber + " its count:" + count);
				lastNumber = nums[i];
				count = 1;
			}
		}

		// last number fix the bug
		//System.out.println("Last Number:" + lastNumber + " its count:" + count);
		if (count >= 3) {
			finalCount += 2;

		} else {
			finalCount += count;
		}

		//System.out.println("FINAL" + finalCount);
        return finalCount;
        
    }
}
