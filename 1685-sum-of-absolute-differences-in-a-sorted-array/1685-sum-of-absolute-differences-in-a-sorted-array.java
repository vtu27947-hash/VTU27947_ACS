class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long prefixSum = 0;

        for (int i = 0; i < n; i++) {
            long current = nums[i];

            
            long left = current * i - prefixSum;

            
            long right = (totalSum - prefixSum - current)
                       - current * (n - i - 1);

            result[i] = (int) (left + right);

            prefixSum += current;
        }

        return result;
    }
}