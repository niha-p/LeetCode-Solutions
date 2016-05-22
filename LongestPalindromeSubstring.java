/*
https://leetcode.com/problems/longest-palindromic-substring/
*/

public class LongestPalindromeSubstring{
    
    public String longestPalindrome(String s) {
        //O(n^2) solution with O(n^2) space - DP
        if (s==null || s.length()<=1)
            return s;
        int n=s.length();
        boolean palin[][]=new boolean[n][n];
        int begin=0;
        int maxlen=1;
        
        for(int i=0; i<n; i++)
            palin[i][i]=true;
        
        for(int i=0; i<n-1;i++)
            if(s.charAt(i)==s.charAt(i+1))
                {
                palin[i][i+1]=true;
                begin=i;
                maxlen=2;
                }
                
        for(int l=3; l<=n;l++)
        {
            for(int i=0;i<n-l+1;i++)
            {
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j) && palin[i+1][j-1])
                {
                    palin[i][j]=true;
                    begin=i;
                    maxlen=l;
                }
            }
        }
        return s.substring(begin,begin+maxlen);
                
       
    }
}