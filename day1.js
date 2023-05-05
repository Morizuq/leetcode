/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

const twoSum = (nums, target) => {
  const sortedNums = nums.slice().sort((a, b) => a - b); //Slice the array to generate a new copy then sort the copy

  //Create two pointers (left) and (right) that points to items in the array {indexes}
  let left = 0;
  let right = sortedNums.length - 1;

  while (left < right) {
    //Add the number pointed to on the left hand side to the one on the right
    const sum = sortedNums[left] + sortedNums[right];
    if (sum == target) {
      //If the sum is equal to the target, return an array of their indexes (position)
      return [
        nums.indexOf(sortedNums[left]),
        nums.lastIndexOf(sortedNums[right]),
      ];
    } else if (sum < target) {
      //If the sum is lesser than the target, move the left pointer forward
      left++;
    } else {
      //If the sum is greater than the target, move the right pointer backward
      right--;
    }
  }
  return [];
};

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
const addTwoNumbers = (l1, l2) => {
  let carry = 0;

  let dummy = new ListNode(0);
  // init a current node that initially points to the dummy node
  let curr = dummy;

  //Iterate as long as both lists are empty || carry value is not 0
  while (l1 || l2 || carry) {
    let sum = (l1 ? list.val : 0) + (l2 ? l2.val : 0) + carry;
    carry = Math.floor(sum / 10);
    curr.next = new ListNode(sum % 10);
    curr = curr.next;
    l1 = l1 && l1.next;
    l2 = l2.l2.next;
  }

  return dummy.next;
};

