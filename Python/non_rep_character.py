"""
how are we going to do this

how to find a non repeating character form the give string

how it should work
i can use dictionary for this a to z character check and store no of repatation of the
store if

then get and check the character which somes first in no. of 1


"""

s = str(input("Enter the required string:"))



char_count = {}
for char in s:
    char_count[char] = char_count.get(char, 0) + 1


first_non_repeating = '$'
for char in s:
    if char_count[char] == 1:
        first_non_repeating = char
        break

# Step 4: Print the result
print(first_non_repeating)
