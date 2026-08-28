class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int total = 1;
        int noOfZero = 0 ;
        for (int n : nums) {
            if(n==0){
                noOfZero++;
                continue;
            }
            total = total * n;
        }
        Map<Integer,Integer> productMap = new HashMap<>();
        int i = 0;
        for (int n : nums) {
            if(noOfZero == 1){
                if(n!=0){
                    result[i] = 0;
                }else {
                    result[i] = total;
                }
            } else if (noOfZero >1) {
                result[i] = 0;
            } else {
                if (productMap.containsKey(n)){
                    result[i] = productMap.get(n);
                }else {
                    int productValue = n;
                    if(n != 0) {
                        productValue = total/n;
                    }
                    productMap.put(n, productValue);
                    result[i] = productValue;
                }
            }
            i++;
        }
        return result;
    }
}  
