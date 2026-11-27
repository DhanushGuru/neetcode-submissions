class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String store = Arrays.toString(chars);
            if(map.containsKey(store)){
                map.get(store).add(str);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(store,list);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
