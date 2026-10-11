class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {

        List<Integer> list = new ArrayList<>();

        for (ListNode curr = head; curr != null; curr = curr.next)
         {
            list.add(curr.val);
        }

        return IntStream.range(0, list.size() / 2)
                .allMatch(i -> list.get(i).equals(list.get(list.size() - 1 - i)));
    }
}
