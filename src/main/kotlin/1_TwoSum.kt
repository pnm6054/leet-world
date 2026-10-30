/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val len = nums.size
    for (i in 0..len - 2) {
        for (j in i + 1..<len) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
        }
    }

    return intArrayOf()
}

