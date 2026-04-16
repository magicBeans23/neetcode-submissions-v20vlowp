class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] frequencyList = new List[nums.length + 1];

        frequencyMap.forEach((key, val) -> {
            if (frequencyList[val] == null) {
                frequencyList[val] = new ArrayList<>();
            }
                frequencyList[val].add(key);
        });
        int[] result = new int[k];
        int index = 0;
        for (int i = frequencyList.length - 1; i >= 0 && index < k; i--) {
            if (frequencyList[i] != null) {
                int c=0;
                while (index < k && c<frequencyList[i].size()) {
                    result[index++] = frequencyList[i].get(c++);
                }
            }
        }
        return result;
    }
    }

