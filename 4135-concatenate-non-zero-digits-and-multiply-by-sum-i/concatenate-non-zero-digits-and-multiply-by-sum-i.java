class Solution {
    public long sumAndMultiply(int n) {

        int sum = 0;

        String ans = "";

        String s = String.valueOf(n);

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) != '0'){
                ans += s.charAt(i);
            }
        }

        for(int i = 0; i < ans.length(); i++){

            sum += ans.charAt(i) - '0';
        }
        if(ans.equals("")){
    return 0;
}

        long res = Long.parseLong(ans);

        res = res * sum;

        return res;
    }
}