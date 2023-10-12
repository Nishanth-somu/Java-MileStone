class Solution {
    public String freqAlphabets(String s) {
        String ans = "";
        int value = 0;
        while(value<s.length()){
            if(value<s.length() - 2 && s.charAt(value + 2)=='#'){
                int num = Integer.parseInt(s.substring(value,value+2));
                ans = ans + (char)(num+96);
                value = value + 3;
                continue;
            }
            ans = ans + (char)(97 + s.charAt(value)-'1');
            value++;
        }
        return ans;
    }
}