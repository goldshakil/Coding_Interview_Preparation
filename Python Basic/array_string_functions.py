
print("#############")

# Important string functions in python (all not in place change):
#### count, endswith, startswith, index, isalpha, isdigit, join, replace, split, upper, lower, translate


# Important list functions in python: https://www.w3schools.com/python/python_ref_list.asp

# Side note: Comparing arrys
a = [1, 2, 3]
b = [1, 2, 3]
if a == b:  # The values and order should be the same -> if you don't care
    print("The same array")
else:
    print("Not the same array")

b = [1, 3, 2]
if a == b:
    print("The same array")
else:
    print("Not the same array")

print("#############")
