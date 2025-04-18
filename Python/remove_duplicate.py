"""input_string = input()
user_list = input_string.split()
n = len(user_list)
lis = list(user_list)

for i in range(n-1):
    for j in range(n):
        if user_list[i] == user_list[j]:
            x = user_list[i]
            user_list.remove(x)
            n = len(user_list)
print(user_list)
"""



input_string = input()
user_list = input_string.split()
n = len(user_list)

i = 0
while i < n:
    j = i + 1
    while j < n:
        if user_list[i] == user_list[j]:
            user_list.pop(j)
            n -= 1
        else:
            j += 1
    i += 1

print(user_list)

