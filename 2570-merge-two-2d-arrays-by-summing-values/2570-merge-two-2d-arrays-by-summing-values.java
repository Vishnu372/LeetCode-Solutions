class Solution {
    public int[][] mergeArrays(int[][] m1, int[][] m2) {
        List<int[]> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m1.length && j < m2.length) {
            if (m1[i][0] == m2[j][0]) {
                mergedList.add(new int[]{m1[i][0], m1[i][1] + m2[j][1]});
                i++;
                j++;
            } else if (m1[i][0] < m2[j][0]) {
                mergedList.add(m1[i]);
                i++;
            } else {
                mergedList.add(m2[j]);
                j++;
            }
        }
        while (i < m1.length) {
            mergedList.add(m1[i]);
            i++;
        }
        while (j < m2.length) {
            mergedList.add(m2[j]);
            j++;
        }
        int[][] result = new int[mergedList.size()][2];
        for (int k = 0; k < mergedList.size(); k++) {
            result[k] = mergedList.get(k);
        }

        return result;
    }
}
