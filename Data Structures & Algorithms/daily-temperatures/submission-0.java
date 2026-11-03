class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            if(stack.size() == 0 || temperatures[i] < temperatures[stack.peek()]){
                stack.push(i);
            }
            else{
                while(stack.size() > 0 && temperatures[i] > temperatures[stack.peek()]){
                    int last = stack.pop();
                    ans[last] = i - last;
                }
            stack.push(i);
            }
        }
        return ans;
    }
}
