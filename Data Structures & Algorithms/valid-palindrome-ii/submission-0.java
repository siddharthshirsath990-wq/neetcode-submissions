class Solution {
    public boolean validPalindrome(String s) {
        int L=0;
        int R=s.length()-1;

        while(L<R){
            if(s.charAt(L)!=s.charAt(R)){
             return   ispalindrome(s,L+1,R) ||
                ispalindrome(s,L,R-1);
            }
            L++;
        R--;
        }
        return true;

    }

    private boolean ispalindrome(String s,int L,int R){

        while(L<R){
            if(s.charAt(L)!=s.charAt(R)){
             return   false;
            }
            L++;
            R--;
        
        }
        return true;
    }
    
}

