input_string = input()
user_list = input_string.split()
n = len(user_list)
lis = list(user_list)



# Check each number from 0 to n
for i in range(n + 1):
    if i not in user_list:
        missing_number = i
        break

print("The missing number is:", missing_number)
