class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            StringBuilder num = new StringBuilder();
            while(str.charAt(j) != '#'){
                num.append(str.charAt(j));
                j++;
            }
            int n = Integer.parseInt(num.toString());
            int end = j + n + 1;
            String curr = str.substring(j+1, end);
            res.add(curr);
            i = end;
        }
        return res;
    }
}
