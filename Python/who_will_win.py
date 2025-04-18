""" in this code i got nice things

thought the code is simple but what happened is here

for now i used simple code got the input and made it simple with input

and checking using for loop but string what happened i just retured the string true and false not the booleans true and false as output"""

#writing the correct code

#input
#get input of arr and k
arr = input()
k = input("Enter the value of K:")

# Loop through the array to check for the element
for i in range(len(arr)):
    if k == arr[i]:
        return True  # Return True immediately if the element is found
    return False  # Return False if the loop completes without finding k



