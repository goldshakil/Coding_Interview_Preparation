class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length<=1)
        {
            return intervals;
        }
        
        Comparator<int[]> comp = new Comparator<int[]>() {

			@Override
			
			//compare two rows(intervals)
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
	

				return Integer.compare(o1[0], o2[0]);
			}
		};
		Collections.sort(Arrays.asList(intervals), comp);
	
		
		List<int[]> list=new ArrayList<int[]>();
		list.add(intervals[0]);
		
		for(int i=1;i<intervals.length;i++)
		{
			
			if(intervals[i][0]<=list.get(list.size()-1)[1])  //joinable
			{
			//	list.get(list.size()-1)[0]=Math.min(intervals[i][0],list.get(list.size()-1)[0]);
				list.get(list.size()-1)[1]=Math.max(intervals[i][1],list.get(list.size()-1)[1]);	
			}
			else
			{
				list.add(intervals[i]);
			}
		}
        
        int answer[][] = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			answer[i][0] = list.get(i)[0];
			answer[i][1] = list.get(i)[1];
		}
        return answer;
		
	
        
    }
}
