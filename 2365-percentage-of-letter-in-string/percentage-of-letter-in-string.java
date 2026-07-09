class Solution {
    public int percentageLetter(String s, char letter) {
        int n = s.length();
        char[] ch = s.toCharArray();
        int count=0;
        for(int i = 0;i<ch.length; i++){
            if(ch[i]== letter){
                count++;
            }
        }
        int res = (count * 100)/n;
        return res;
       


        
    }
}