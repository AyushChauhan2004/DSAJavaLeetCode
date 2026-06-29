class NumArray {
    private int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1;i < nums.length;i++) {
            prefix[i] = prefix[i - 1] +nums[i];
        }
    }
//can be using prefix[0] = 0; then return prefix[right + 1] - prefix[left] 
    public int sumRange(int left,int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}
