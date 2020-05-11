class Solution {
    public void rotate(int[] nums, int k) {
        
     
        
        
        for(int i=0;i<k;i++) //how many times you wanna move
        {
            
           int temp=nums[0]; //storing the last element
            int prv_temp=nums[0];
            for(int j=0;j<nums.length-1;j++)
            {
                temp=nums[j+1]; //used in next step
                nums[j+1]=prv_temp;
                prv_temp=temp;
                
                
            }
            
            nums[0]=temp;
            
        }
        
    }
}

// Solution2 
class Solution {
    public void rotate(int[] nums, int k) {
        
     
        int nums2[]=Arrays.copyOf(nums,nums.length);
        if(nums.length==1) return;
        
         //store the answer in nums
          
            for(int j=0;j<nums.length;j++) //nums2 -> iterate
            {
               if(j+k>nums.length-1) //dealing with real indices
               {
                   
                   nums[(j+k)%nums.length]=nums2[j];
               }
                else
                {
                    nums[j+k]=nums2[j];
                }
                
                
            }

            
        }
        
    }
