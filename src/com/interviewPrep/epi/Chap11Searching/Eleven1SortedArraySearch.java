package com.interviewPrep.epi.Chap11Searching;

public class Eleven1SortedArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,10,10,15};
        System.out.println(searchForK(arr, 10));
        System.out.println(searchForFirstElementGreaterThanK(arr, 5));
        System.out.println(searchForFirstElementGreaterThanK(arr, 9));
        System.out.println(searchForFirstElementGreaterThanK(arr, 12));
    }

    private static int searchForK(int[] arr, int k){
        int index = -1;
        int small = 0, large = arr.length - 1;
        while(small <= large){
            int mid = (small + large) / 2;
            if(arr[mid] < k){
                small = mid + 1;
            }else if(arr[mid] > k){
                large = mid - 1;
            }else{
                index = mid;
                large = mid -1 ;
            }
        }
        return index;
    }

    static int searchForFirstElementGreaterThanK(int[] arr, int k){
        int small = 0, large = arr.length - 1;
        while(small < large){
            int mid = (small + large) / 2;
            if(arr[mid] < k)
                small = mid + 1;
            else if(arr[mid] > k)
                large = mid - 1;
        }
        return small;
    }
}
