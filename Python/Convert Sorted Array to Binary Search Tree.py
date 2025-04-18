def createbst(nums):
    if not nums:
        return None  # Base case: no elements left

    mid = len(nums) // 2
    root = nums[mid]

    left_subtree = createbst(nums[0:mid])
    right_subtree = createbst(nums[mid+1:])

    return [root, left_subtree, right_subtree]  # or TreeNode if you're doing a real tree

# Sample input
nums = [-10, -3, 0, 5, 9]
result = createbst(nums)
print(result)
