package com.test.testLeetCode;

import cucumber.api.java.sl.In;
import org.mockito.internal.matchers.CompareTo;

import java.util.*;

public class Test20210425MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement2(new int[]{2,2,1,1,1,2,2,3,3,3,2,2}));
    }

    public static int majorityElement2(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }



    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        for (int a:nums
             ) {
            if (hm.containsKey(a)) {
                hm.put(a,hm.get(a)+1);
            }else {
                hm.put(a, 1);
            }
        }
        List<HashMap.Entry<Integer, Integer>> list=new ArrayList<HashMap.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(list, new Comparator<HashMap.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        return list.get(0).getKey();
    }
}
