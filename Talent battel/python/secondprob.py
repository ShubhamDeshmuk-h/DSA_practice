num1 = [1,2,3,4,5]
num2 = [0,0,0,0,0]


def alertnateelement(num1,num2):

    lenght = len(num1)
    final_array = []

    for i in range(0,lenght):
        final_array.append(num1[i])
        final_array.append(num2[i])
    return final_array


def alertnateelement2(num1,num2):

    lenght = len(num1)
    print("[")
    for i in range(0,lenght):
        print(num1[i])
        print(num2[i])
        break
    print("]")
arr = alertnateelement(num1,num2)
print(arr)

arr2 = alertnateelement2(num1,num2)
print(arr2)

#solution uses the append function so now that we want to create it without help of append function how can we do it


#numpy can be used for the