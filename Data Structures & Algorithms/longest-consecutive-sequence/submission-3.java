class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        int max = 0;
        int freq = 1;
        for (int num : treeSet) {
            freq = treeSet.contains(num - 1) ? freq + 1 : 1;
            max = Math.max(max,freq);
        }
        return max;        
    }
}
