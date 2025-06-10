nums = [3,3,4] 
# now we have this

count = {}
count[nums[0]] = 2
count[nums[1]] = 2
count[nums[2]] = 1

print(count)

value = max(count,key = count.get)
print(value)

now i want to find the max value in the dictionary and return the key
# i will use the max function to find the max value in the dictionary and return the key

#what can i do to get the value of the key with largest value in the diction
