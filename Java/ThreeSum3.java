package CODECHEF_BEGINNERS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum3 {
     public static void main(String args[]){
         ThreeSum3 sum=new ThreeSum3();
         int []arr={-1, 0, 1, 2, -1, -4};
         System.out.println(sum.threeSum(arr));
     }
     public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>>li=new ArrayList<>();

         Arrays.sort(nums);
         for(int i=0;i<nums.length-2;i++){
             int l=i+1;
             int r=nums.length-1;
             int a=nums[i];
             while(l<r){
                 int sum=a+nums[l]+nums[r];
                 if(sum==0){
                     List<Integer>x=new ArrayList<>();
                     x.add(a);
                     x.add(nums[l]);
                     x.add(nums[r]);
                     li.add(x);
                     int prevl=nums[l];
                     while (l<r&&nums[l]==prevl){
                         l++;
                     }
                 }
                 else if(sum<0){
                   l++;
                 }
                 else if(sum>0){
                     r--;
                 }
             }
         }
         return li;
     }
}
