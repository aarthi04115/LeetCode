class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        int small = nums[0];
        int larg = nums[n-1];
        for(int i=small; i<larg; i++){
            boolean found = false;
            for(int x : nums){
                if(x == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                ans.add(i);
            }
        }
        return ans;  
    }
}