/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p1 = l1
        var p2 = l2
        var result = mutableListOf<Int>()
        
        var carry = 0
        while (true) {
            if (p1 == null && p2 == null) {
                break
            }
            
            val v1 = p1?.`val` ?: 0
            val v2 = p2?.`val` ?: 0
            
            p1 = p1?.next
            p2 = p2?.next
            
            val sum = v1 + v2 + carry
            carry = if (sum >= 10) 1 else 0
            
            result.add(sum % 10)
        }
        
        if (carry > 0) {
            result.add(carry)
        }
        
        var head = ListNode(result[0])
        var cur = head
        for (i in 1 until result.size) {
            cur.next = ListNode(result[i])
            cur = cur.next!!
        }
        
        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

