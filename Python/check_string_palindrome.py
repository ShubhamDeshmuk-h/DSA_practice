"""
we have learned that how to reverse the string

and palindrome is what
the stright string and reverese string are equal using this code we can find the if give string is equal to other after

reverser

just added the condition if for checking if the give condition is satisfied the just print
store the things

"""



S= input("Enter the string: ")
reverse = ""
l = len(S)
for i in range(l - 1, -1, -1):
    reverse += S[i]

if (S == reverse):
    a = 1
else:
    a = 0
print(a)