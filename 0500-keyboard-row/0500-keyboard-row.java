public class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        Set<Character> set1 = new HashSet<>();
        for (char c : row1.toCharArray()) {
            set1.add(c);
        }
        Set<Character> set2 = new HashSet<>();
        for (char c : row2.toCharArray()) {
            set2.add(c);
        }
        Set<Character> set3 = new HashSet<>();
        for (char c : row3.toCharArray()) {
            set3.add(c);
        }
        List<String> validWords = new ArrayList<>();
        for (String word : words) {
            if (isValid(word, set1) || isValid(word, set2) || isValid(word, set3)) {
                validWords.add(word);
            }
        }
        return validWords.toArray(new String[0]);
    }
    
    private boolean isValid(String word, Set<Character> set) {
        for (char c : word.toLowerCase().toCharArray()) {
            if (!set.contains(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(solution.findWords(words)));
    }
}
