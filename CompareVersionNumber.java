/*
https://leetcode.com/problems/compare-version-numbers/
*/

public class CompareVersionNumber{
    public int compareVersion(String version1, String version2) {
        if(!version1.contains(".") && !version2.contains("."))
        {
            int a=Integer.parseInt(version1);
            int b=Integer.parseInt(version2);
            if(a>b)
                return 1;
            else if (b>a)
                return -1;
            return 0;    
        }
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int j=0;
        int i=0;
        for(i=0; i<s1.length && j<s2.length; i++)
            {
                if (Integer.parseInt(s1[i])==Integer.parseInt(s2[j]))
                    j++;
                else if (Integer.parseInt(s1[i])>Integer.parseInt(s2[j]))
                    return 1;
                else if (Integer.parseInt(s1[i])<Integer.parseInt(s2[j]))
                    return -1;
                
            }
          //System.out.println("version1:"+Arrays.toString(s1));
          //System.out.println("version2:"+Arrays.toString(s2));
          //System.out.println("i:"+i);
          //System.out.println("j:"+j);
        if(j<s2.length)
        {
            if (Integer.parseInt(s2[s2.length-1])>0)
                return -1;
        }
        if(i<s1.length)
            if (Integer.parseInt(s1[s1.length-1])>0)
                return 1;
        return 0;
    }
}