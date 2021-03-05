package com.interviewPrep.epi.Chap11Searching;

public class Eleven2SearchCyclicallySortedArray {
    public static void main(String[] args) {
        int[] arr = {21, 34, 66, 2, 9, 10, 19};
        System.out.println(arr[findSmallestNumber(arr)]);
        System.out.println(findK(arr, 34));
    }

    private static int findSmallestNumber(int[] arr) {
        int small = 0, large = arr.length - 1;
        while(small < large){
            int mid = (small + large)/2;
            if(arr[mid] > arr[large]){
                small = mid + 1;
            }else{
                large = mid;
            }
        }
        return small;
    }

    private static int findK(int[] arr, int k){
        int index = -1;
        int pivot = findSmallestNumber(arr);

        if(arr[pivot] == k){
            return pivot;
        }

        int small = pivot, large = arr.length - 1;
        if(arr[0] < k){
            small = 0;
            large = pivot - 1;
        }

        while(small <= large){
            int mid = (small + large)/2;
            if(arr[mid] < k)
                small = mid + 1;
            else if(arr[mid] > k)
                large = mid - 1;
            else {
                index = mid;
                break;
            }
        }

        return index;
    }
}
