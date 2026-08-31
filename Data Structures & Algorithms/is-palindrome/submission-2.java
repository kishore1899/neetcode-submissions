class Solution {
    public boolean isPalindrome(String s) {
        String input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] inputArr = input.toCharArray();
        int arrLen = inputArr.length;
        if(arrLen ==0){
            return true;
        }
        for (int i = 0; i <= arrLen / 2; i++) {
            if (inputArr[i] != inputArr[arrLen - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
