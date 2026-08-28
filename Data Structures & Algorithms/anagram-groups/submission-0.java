class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> grpMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

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

        for (List<String> list : grpMap.values()) {
            result.add(list);
        }
        return result;
    }
}
