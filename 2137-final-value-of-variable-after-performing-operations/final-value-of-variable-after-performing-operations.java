class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        int n = operations.length;
        for(int i=0; i<n; i++){
            if(operations[i].contains("++")){
                count++;
            }else{
                count--;
            }
        }
        return count;
        
    }
}