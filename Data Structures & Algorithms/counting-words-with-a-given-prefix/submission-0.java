class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(words[i].indexOf(pref)==0){
                count++;
            }
        }
        return count;
    }
}