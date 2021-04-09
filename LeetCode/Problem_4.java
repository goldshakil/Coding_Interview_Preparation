import java.util.Arrays;
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1=nums1.length;
        int n2=nums2.length;

        int arr3[]=new int[n1+n2];
        // append the arrays 
        int i = 0, j = 0, k = 0; 
      
        // Traverse both array 
        while (i < n1 && j < n2) 
        { 
           arr3[k++] = nums1[i++]; 
            arr3[k++] = nums2[j++]; 
        } 
      
        // Store remaining elements of first array 
        while (i < n1) 
            arr3[k++] = nums1[i++]; 
      
        // Store remaining elements of second array 
        while (j < n2) 
            arr3[k++] = nums2[j++]; 
        
        Arrays.sort(arr3);
        int size3=arr3.length;
        
        
        if(size3%2==0)//even
        {
             size3--;
            return (arr3[(size3/2)]+arr3[((size3/2)+1)])/2.0;
        }
        else 
        {
             size3--;
            return (arr3[size3/2]);
        }
    
    
    
    }        // sort them and pick the media

    
    
    }
