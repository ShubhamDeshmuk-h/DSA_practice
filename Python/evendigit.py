nums = [12, 345, 2, 6, 7896]
count = 0
nums2 = []

# Convert numbers to strings
for i in range(len(nums)):
    nums2.append(str(nums[i]))
finalcount = []

# Read count of the digits in the list
for i in range(len(nums)):
    finalcount.append(len(nums2[i]))

# Count numbers with an even number of digits
for i in range(len(finalcount)):
    if finalcount[i] % 2 == 0:
        count += 1

print(count)

