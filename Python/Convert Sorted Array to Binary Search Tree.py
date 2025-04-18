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


#this code only runs for local sample inputs
#if we want to run for other sorted arrays we have to use class TreeNode and create a tree structure then 

#create root node 
#root node have three things 1 value 2 left 3 right Child

we use the recuresion like root.left = createbst(nums[0:mid]) and root.right = createbst(nums[mid+1:])
#this will create a tree structure and we can use the class TreeNode to create a tree node and return the root node of the tree
#this will create a balanced binary search tree from the sorted array and return the root node of the tree