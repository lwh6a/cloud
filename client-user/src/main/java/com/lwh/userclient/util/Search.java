package com.lwh.userclient.util;

/**
 * @author <a href="mailto:liuwenhao@fenxiangbuy.com">刘文豪</a>
 * @since 2021/4/26
 */

public class Search {

    //
    public int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length;
        while (l <= r) {
            int mid = l + (l + r)/2;
            if (arr[mid] == target) {
                return arr[mid];
            }else if (target > arr[mid]) {
                l = mid;
            }else if (target < arr[mid]) {
                r = mid;
            }

        }

        final int[] iarr = {1,2,3,5};
        iarr[2] = 24;  // 合法
//        iarr[3] = null;  //非法

    return 0;

    }

}
