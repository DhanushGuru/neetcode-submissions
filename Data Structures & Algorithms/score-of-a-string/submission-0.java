class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int left =(int)s.charAt(i);
            int right = (int)s.charAt(i + 1);
            sum += Math.abs(right - left);
        }
        return sum;
    }
}