class Solution {

        public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for (String str : strs) {
            int size = str.length();
            encode.append(size).append("#").append(str);
        }
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> encodedList = new ArrayList<>();
        while (!str.isEmpty()) {
            int sizeIdx = str.indexOf("#");
            int strRange = Integer.parseInt(str.substring(0, sizeIdx));
            if (strRange == 0) {
                encodedList.add(new String());
            } else {
                encodedList.add(str.substring(sizeIdx + 1, sizeIdx + 1 + strRange));
            }
            str = str.substring(sizeIdx + strRange + 1);
        }
        return encodedList;
    }
}
