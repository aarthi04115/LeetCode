class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        for(int num1 : nums1){
            set.add(num1);
        }
        HashSet<Integer>common = new HashSet<>();
        for(int num2 : nums2){
            if(set.contains(num2)){
                common.add(num2);
            }
        }
        int[]ans = new int[common.size()];
        int index = 0;
        for(int num: common){
            ans[index] = num;
            index++;
        }
        return ans;
        
    }
}