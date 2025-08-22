import java.util.Arrays;
public class mergeSortedarraysoptimal {
    static void swap(int[] arr1, int a, int[] arr2, int b){
        int temp = 0;
        temp = arr1[a];
        arr1[a] = arr2[b];
        arr2[b] = temp;

    
    }
    static void merged(int[] nums1, int m, int[] nums2, int n){
        int left = m-1;
        int right = 0;
        while(left > 0 && right < m){
            if(nums1[left] > nums2[right]){
                swap(nums1, left, nums2,right);
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
}
