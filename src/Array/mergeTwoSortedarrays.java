
class mergeTwoSortedarrays {
    public void mergeNaive(int[] nums1, int m, int[] nums2, int n) {
        int [] nums3 = new int [ m + n];
        int left = 0;
        int right = 0;
        int index = 0;

        while(left < m && right < n){
            if(nums1[left] <= nums2[right]){
                nums3[index] = nums1[left];
                index++;
                left++;

            }
            else{
                nums3[index] = nums2[right];
                right++;
                index++;
            }
        }

        while(left < m){
            nums3[index] = nums1[left];
            index++;
            left++;
        }
         while(right < n){
            nums3[index] = nums2[right];
            index++;
            right++;
        }  
        // putitng back the elements
          for(int i = 0; i < n + m; i++){
            if(i < n){
                nums1[i] = nums3[i];
            }
            else{
                nums2[i - n] = nums3[i];
            }
        }

        

        }
        static void merged(int[] nums1, int m, int [] nums2, int n){
        
            
        
    }
    public static void main(String[] args) {
        
    }
}