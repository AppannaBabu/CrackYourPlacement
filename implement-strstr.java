// problem link: https://leetcode.com/problems/implement-strstr/
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==needle.length())
            if(haystack.equals(needle))
                return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0;
                for(j=0;j<needle.length();j++)
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                        j=needle.length()+1;
                if(j==needle.length())
                    return i;
            }
        }
        return -1;
    }
}