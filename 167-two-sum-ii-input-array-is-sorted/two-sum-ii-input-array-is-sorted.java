class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> need = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int complement = target - numbers[i];
            if(!need.containsKey(complement)){
                need.put(numbers[i], i);
                continue;
            }
            return new int[]{need.get(complement)+1, i+1};
        }
        return new int[]{};
    }
}