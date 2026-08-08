class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }    
        int n=0;
        while(n < s.length()){
            String str = s.substring(n) + s.substring(0,n);
            if(str.equals(goal)){
                return true;
            }
            n++;
        }
        return false;
    }
}