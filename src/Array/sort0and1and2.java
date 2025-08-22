// Dutch national flag algorithm - sort O and 1 and 2 inplace in the array.
 

class sort0and1and2 {
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0,1,2,2,0,1,1,0,2};
      sortColors(arr);
        for(int num : arr){
            System.out.print(" "+ num);
        }

    }
}
