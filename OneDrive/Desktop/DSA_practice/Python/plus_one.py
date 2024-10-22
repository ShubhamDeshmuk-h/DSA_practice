input_list = input("Enter a number: ")

# Split the input into individual characters and convert each to an integer
digi = [int(d) for d in input_list.split()]

# Get the length of the list
n = len(digi)

# Increment the last digit
for i in range(n - 1, -1, -1):
    if digi[i] < 9:
        digi[i] += 1
        break
    else:
        digi[i] = 0
else:
    # If all digits were 9, add a 1 at the beginning
    digi.insert(0, 1)

# Print the resulting list of digits
print(digi)

#for leetcode

"""
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        digi = digits
        
        # Get the length of the list
        n = len(digi)

        for i in range(n - 1, -1, -1):
            if digi[i] < 9:
                digi[i] += 1
                break
            else:
                digi[i] = 0
        else:
            
            digi.insert(0, 1)
        
        return digi

"""