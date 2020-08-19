package CODECHEF_BEGINNERS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> x=new ArrayList<>();
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        x.add(nums[i]);
                        x.add(nums[j]);
                        x.add(nums[k]);
                        Collections.sort(x);
                        if(!li.contains(x))
                            li.add(new ArrayList<>(x));
                        x.clear();
                    }
                }
            }
        }
        return li;
    }
    public static void main(String args[]){
        ThreeSum sum=new ThreeSum();
        int []arr={-1, 0, 1, 2, -1, -4};
        System.out.println(sum.threeSum(arr));
    }
}
