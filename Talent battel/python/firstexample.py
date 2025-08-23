
number = int(input("Enter the number of mints"))
lenq = int(input("Enter the lenght of queue:"))

def find_total_mint(n,lenq):
    sum = n
    previous = sum-1
    if lenq != 1:
        for i in range(0,lenq-1):
            previous = sum -1
            sum += previous
        return sum
    else:
        return sum

n = find_total_mint(number,lenq)
print(n)