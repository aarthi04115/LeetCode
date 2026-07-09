class Solution {
    public int numIdenticalPairs(int[] nums) {
       int res=0;
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int num : nums){
        int freq = map.getOrDefault(num,0);
        res += freq;
        map.put(num, freq+1);

       }
       return res;
        
    }
}