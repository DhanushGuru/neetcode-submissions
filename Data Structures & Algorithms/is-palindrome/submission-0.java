class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder();  
        StringBuilder ori = new StringBuilder();      
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                rev.append(Character.toLowerCase(ch));
            }
        }        
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ori.append(Character.toLowerCase(ch));
            }
        }
        return rev.toString().equals(ori.toString());
    }
}
