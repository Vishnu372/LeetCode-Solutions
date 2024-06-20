class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        int sn = searchWord.length();
        int i = 0;
        for (String str : s) {
            int n = str.length();
            if (n >= sn) {
                String sr = str.substring(0, sn);
                if (searchWord.equals(sr)) {
                    return i + 1;
                }
            }
            i++;
        }
        return -1;
    }
}