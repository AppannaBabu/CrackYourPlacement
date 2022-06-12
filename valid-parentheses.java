// problem link: https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('$');
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                stack.push('}');
            }
            else if(s.charAt(i)=='('){
                stack.push(')');
            } 
            else if(s.charAt(i)=='['){
                stack.push(']');
            }
            else if(s.charAt(i)==stack.peek()){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.peek()=='$';
    }
    
}