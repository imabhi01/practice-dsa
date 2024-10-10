# Bubble sort in ascending order
def bubble_sort(data):
 
    for i in range(len(data) - 1):
        swapped = False
        # len(data) - 1 - i is written for optimizing and not re-running the checks for the already sorted values.
        for j in range(len(data) - 1 - i): 
            if data[j] > data[j + 1]:
                data[j], data[j+1] = data[j+1], data[j]
                swapped = True
        if not swapped:
            break
        
    return data

data_list = [1, 15, 6, 8, 2, 5, 9]
sorted_list = bubble_sort(data_list)
print(sorted_list)

