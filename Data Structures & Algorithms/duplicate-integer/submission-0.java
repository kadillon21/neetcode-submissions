class Solution {
    public boolean hasDuplicate(int[] nums) {

        return !((long)nums.length == Arrays.stream(nums).distinct().count());
    }
}