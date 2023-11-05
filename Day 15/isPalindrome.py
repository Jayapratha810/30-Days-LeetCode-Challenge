// Palindrome Linked List

class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if not head:
            return True
        slow =fast=head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        prev = None
        while slow:
            curr = slow
            slow = slow.next
            curr.next = prev
            prev = curr
        
        while prev:
            if prev.val != head.val:
                return False

            prev = prev.next
            head = head.next
        return True
