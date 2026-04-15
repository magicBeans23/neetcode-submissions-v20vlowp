class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> []  buckets = new List[nums.length+1];

        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
           buckets[entry.getValue()].add(entry.getKey());
        }
        
        int[] finalArray = new int[k];
        int index=0;

        for(int i= buckets.length-1; i>0;i--){
            for(int j=0;j<buckets[i].size();j++){
                finalArray[index++] = buckets[i].get(j);
                if(index==k)
                    return finalArray;
            }
        }

        return finalArray;
    }
}
