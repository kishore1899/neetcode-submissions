class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> resultMap = new TreeMap();
        for (Integer i:nums){
            if(resultMap.containsKey(i)){
                resultMap.put(i, resultMap.get(i) + 1);
            }
            resultMap.putIfAbsent(i,1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(resultMap.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] result = new int[k];
        for(int i = 0 ;i<k&&k<=list.size();i++ ){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
