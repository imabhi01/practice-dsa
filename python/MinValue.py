array = [9,3,4,5,6,7]
minVal = array[0]

for i in array:
    if i < minVal:
        minVal = i

print(minVal)