class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        int small = nums[0];
        int larg = nums[n-1];
        HashSet<Integer>set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        for(int i=small; i<=larg; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
                 
    }
}