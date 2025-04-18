
inputlist = input()
arr = inputlist.split()
nums = list(arr)


count = 0


for i in range(len(nums)):
    if nums[(i - 1) % len(nums)] > nums[i]:
        count += 1
    if count > 1:
        is_rotated_sorted = False
        break
else:
    is_rotated_sorted = True

print(is_rotated_sorted)
