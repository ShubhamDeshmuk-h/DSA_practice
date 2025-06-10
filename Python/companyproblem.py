"""
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
"""
nums = [-4,-1,0,3,10]
Value = []
sorted_arr = sorted(nums, key=abs) 
print(sorted_arr)
for i in sorted_arr:
    Value.append(i**2)
print(Value)

