class Solution {
    public String[] divideString(String s, int k, char fill) {
        // int len = 0;
        while (s.length() % k != 0) {
            s += fill;
        }
        String[] result = new String[s.length() / k];
        int i = 0;
        int index = 0;

        while (i < s.length()) {
            String subStr = s.substring(i, i + k);
            result[index++] = subStr;
            i = i + k;
        }
        return result;
    }
}