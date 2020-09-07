package com.practice;

public class FindClosest {

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 6, 8, 9};
        int k = 3;
        System.out.println(findClosest(arr,k));
    }

    public static int findClosest(int arr[], int k) {
        int low = 0, high = arr.length - 1;
        if (k <= arr[low])
            return arr[low];
        if(k>=arr[high])
            return arr[high];
        int i = low,j = high,mid = 0, ans = 0;
        while (i<j){
            mid = (i+j)/2;
            if(arr[mid]==k)
                return arr[mid];
            if(arr[mid]>k) {
                if (mid > 0 && arr[mid - 1] < k)
                    return getclosest(arr[mid - 1], arr[mid], k);
                j = mid;
            }
            if(arr[mid]<k)
                if (mid<arr.length-1 && arr[mid+1]>k)
                    return getclosest(arr[mid], arr[mid + 1] , k);
                i = mid+1;
        }
        return arr[mid];
    }
    public static int getclosest(int a,int b, int k) {
        if (k - a >= k - b)
            return b;
        else
            return a;
    }
}
