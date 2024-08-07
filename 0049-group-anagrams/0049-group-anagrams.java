class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> li = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; // Track visited strings

        for (int i = 0; i < strs.length; i++) {
            if (!visited[i]) {
                List<String> group = check(strs[i], strs, i, visited);
                li.add(group);
            }
        }
        return li;
    }

    private List<String> check(String s, String[] a, int j, boolean[] visited) {
        List<String> li = new ArrayList<>();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        li.add(s);
        visited[j] = true;

        for (int i = j + 1; i < a.length; i++) {
            if (!visited[i] && c.length == a[i].length()) {
                char[] v = a[i].toCharArray();
                Arrays.sort(v);
                if (Arrays.equals(c, v)) {
                    li.add(a[i]);
                    visited[i] = true;
                }
            }
        }
        return li;
    }
}