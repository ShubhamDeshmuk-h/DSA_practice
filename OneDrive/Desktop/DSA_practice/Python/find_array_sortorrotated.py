#getting input
inputlist = input()
arr = inputlist.split()
nums = list(arr)


# Count of jumps
count = 0

# array loop
for i in range(len(nums)):
    # Check if the previous element is greater than the current element
    if nums[(i - 1) % len(nums)] > nums[i]:
        count += 1
    if count > 1:
        is_rotated_sorted = False
        break
else:
    is_rotated_sorted = True

# Output the result
print(is_rotated_sorted)
