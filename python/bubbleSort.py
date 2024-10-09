# Replace ___ with your code

# Main Logic
# if(lst[i] < lst[i+1]):
#     lst[i], lst[i+1] = lst[i+1], lst[i]

def bubble_sort(lst):
    # write your code here
    for j in range(len(lst)):
        for i in range(len(lst) - 1):
            if(lst[i] < lst[i+1]):
                lst[i], lst[i+1] = lst[i+1], lst[i]
    return lst


# Test input
# 1 15 6 8 2 5 9

# take integer inputs and convert it to a list
# data_list = list(map(int, input().split()))

data_list = [1, 15, 6, 8, 2, 5, 9]
sorted_list = bubble_sort(data_list)
print(sorted_list)