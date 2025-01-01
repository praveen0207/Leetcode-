class Solution {
    public int maxScore(String s) {
      int n = s.length();
      int onecount = 0;
      for(int i=0;i<n;i++){
        if(s.charAt(i) == '1'){
            onecount++;
        }
      } 
      int zeroCount = 0;
      int maxScore = 0;
      for(int i=0;i<n-1;i++){
        if(s.charAt(i) == '1'){
            onecount--;
        }else{
            zeroCount++;
        }
        maxScore = Math.max(maxScore, zeroCount + onecount);
      }
      return maxScore;
    }
}