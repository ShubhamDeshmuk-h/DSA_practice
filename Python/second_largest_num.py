input_string = input()
user_list = input_string.split()
n = len(user_list)
lis = list(user_list)

for i in range(n):
    for j in range(n):
        if user_list[i] > user_list[j]:
            temp = user_list[i]
            user_list[i] = user_list[j]
            user_list[j] = temp

if user_list[1] == user_list[0] and user_list[1] == user_list[2]:
    print("-1")
else:
    print(user_list[1])





