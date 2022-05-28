// problem link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int s=0,c=0,r=0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0,1);
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            r=s%k;
            if(r<0)
                r+=k;
            if(m.get(r)!=null){
                c+=m.get(r);
                m.put(r,m.get(r)+1);
            }
            else{
                m.put(r,1);
            }
        }
        return c;
    }
}