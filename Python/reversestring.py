#first we will take input the we will go for the next
"""
how code will works explained here

first input
after input we will take lenght of the string

after getting lenght we will use for loop with the reverse loop of range
like range(l-1,-1,-1)
this will just make our code more easy to understand
after getting this into the for loop

we will store the each character in to the variable reverse
using indexing so

IMP i forgot to initatalize the reverese variable so it can store the index otherwise it won't store anything
 before using it into the



"""

# getting input form the user

s = input("Enter the string: ")
reverse = ""  # Initialize an empty string to store the reversed characters
l = len(s)

for i in range(l - 1, -1, -1):  # Start from the last index to the first
    reverse += s[i]

print(reverse)