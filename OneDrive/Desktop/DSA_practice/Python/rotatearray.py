user_input = list(map(int,input("Enter list of element sepating by space by space:").split()))

#before i was using this to take the input then split it and then convert to list but still input taken was not in int datatype

# well now i can store that with the input in int so using map and split in one i can minimize this code and get the best output

#input_list = user_input.split()
#lis = list(input_list)
#rotatee(lis,k)
k = int(input("Enter number K to rotate: "))


n = len(user_input)
rotate = user_input[ -k:] + user_input[ : -k ]
for i in range(n):
    user_input[i] = rotate[i]

print(user_input)
