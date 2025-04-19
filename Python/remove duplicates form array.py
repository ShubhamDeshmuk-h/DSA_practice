nums = [1,1,1,2,2,3]
final = []
i = 0
while i != len(nums):
    j = 0
    #now what we can do check send and third element
    if j != 2 :
        final.append(nums[i])
        if nums[i] == nums[i+1]:
            j = j+1
        else:
            i = i+1
            break
    
    