class Solution {
 public int maxResult(int[] nums, int k) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(0);
    for(int i = 1; i < nums.length; i++) {
        nums[i] += nums[deque.peek()];
        if(i - k == deque.peek()) deque.poll();
        while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) deque.pollLast();
        deque.add(i);
    }
    return nums[nums.length - 1];
}
}