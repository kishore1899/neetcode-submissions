class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> grpMap = new HashMap<>();

        for(String str :strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);
            if(grpMap.containsKey(sorted)){
                List<String> value = grpMap.get(sorted);
                value.add(str);
                grpMap.put(sorted,value);
            }else{
                grpMap.put(sorted,new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(grpMap.values());
    }
}
