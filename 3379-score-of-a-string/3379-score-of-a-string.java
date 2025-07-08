class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int a=i;
            int b=i+1;
            char first=s.charAt(a);
            char second=s.charAt(b);
            int x=Math.abs(first-second);
            ans=ans+x;
        }
        return ans;
    }
}