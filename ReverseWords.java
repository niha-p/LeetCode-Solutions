/*
https://leetcode.com/problems/reverse-words-in-a-string/
*/

public class ReverseWords {
    public String reverseWords(String s) {
        if (s.equals("") || s.equals(" "))
            return "";
        
        s=s.trim();
        int end=0;
        if(s.length()<2)
            return s;
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1; i>=0; i--)
        {
            if(s.charAt(i)==' ')
                continue;
            end=i;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            ans.append(s.substring(i+1,end+1)).append(" ");    
                
        }
        return ans.toString().trim();
    }
}