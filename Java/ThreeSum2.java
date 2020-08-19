package CODECHEF_BEGINNERS;

import java.util.*;

class ThreeSum2 {
    public static void main(String args[]){
        ThreeSum2 sum=new ThreeSum2();

        int []arr={-1, 0, 1, 2, -1, -4};
        System.out.println(sum.threeSum(arr));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>li=new ArrayList<>();
        List<Integer>x=new ArrayList<>();
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int complement=-nums[i]-nums[j];
                if(m.containsKey(complement)&&m.get(complement)!=j&&m.get(complement)!=i){
                    x.add(nums[i]);
                    x.add(nums[j]);
                    x.add(nums[m.get(complement)]);
                }
                Collections.sort(x);
                if(!li.contains(x)&&!x.isEmpty())
                li.add(new ArrayList<>(x));
                x.clear();
            }
        }
        return li;
    }
}
