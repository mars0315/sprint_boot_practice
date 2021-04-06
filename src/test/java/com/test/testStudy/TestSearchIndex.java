package com.test.testStudy;

public class TestSearchIndex {
    public static void main(String[] args) {
        searchIndex2(new int[]{2,3,4,5,78,6,77,89},6);
    }

    public static int searchIndex2(int[] ints,int n) {
        int min=0;
        int max=ints.length-1;
        int mid=(min+max)/2;
        while (n!=ints[mid]){
            if (n>ints[mid]) {
                min=mid+1;
            }else {
                max=mid-1;
            }
            mid=(min+max)/2;
        }
        return mid;
    }

    public static int searchIndex(int[] ints,int n){
        for (int i = 0; i <ints.length ; i++) {
            if (ints[i] == n) {
                return i;
            }
        }
        return 0;
    }
}
