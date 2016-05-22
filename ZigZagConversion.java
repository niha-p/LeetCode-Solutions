/*
https://leetcode.com/problems/zigzag-conversion/
*/

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        
        if(numRows==1 || numRows>=s.length())
            return s;
        
        String[] a=new String[numRows];
        String ans="";
        for (int i=0; i<numRows; i++)
            a[i]="";
        int step=1;
        int index=0;
        
        for(int i=0; i<s.length(); i++)
        {
            a[index]+=s.charAt(i);
            if (index==0)
                step=1;
            else if(index==numRows-1)
                step=-1;
                
            index+=step;
        }
        for(int i=0; i<numRows; i++)
            ans+=a[i];
        return ans;    
    }
}