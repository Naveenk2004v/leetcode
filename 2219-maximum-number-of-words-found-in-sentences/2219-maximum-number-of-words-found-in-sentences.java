class Solution {
    public int mostWordsFound(String[] sentences) {
         int count=0;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            int temp=1;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' '){
                    temp++;
                }
            }count=Math.max(count,temp);
        }return count;
    }
}