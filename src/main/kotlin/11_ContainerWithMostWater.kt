import kotlin.math.min

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 */
fun maxArea(height: IntArray): Int {
    var max = 0
    val len = height.size
    var i = 0
    var j = len - 1
    while (true) {
        if (i >= j) {
            break
        }

        val w = j - i
        val h = min(height[i], height[j])
        if (max < w * h) {
            max = w * h
        }

        if (height[i] > height[j]) {
            j -= 1
        } else {
            i += 1
        }
    }
    return max
}

