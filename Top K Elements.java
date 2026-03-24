class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2 & 3: Sort by frequency (descending) and extract elements
        List<Integer> sortedCount = new ArrayList<>(count.keySet());
        sortedCount.sort((a, b) -> count.get(b) - count.get(a));

        // Step 4 & 5: Loop till k and return
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
        result[i] = sortedCount.get(i); // ← [i] instead of .add()
    }


        return result;
    }
}