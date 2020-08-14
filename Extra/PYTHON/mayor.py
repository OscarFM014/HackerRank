def mayor(list,a,b):
    new = list[a-1:b]
    new.sort()
    return new[len(new)-1]









print(mayor([1,10, 25, 43, 21, 10, 2, 35, 44, 83], 1, 10))
print(mayor([1,10, 25, 43, 21, 10, 2, 35, 44, 83], 2, 3))
print(mayor([1,10, 25, 43, 21, 10, 2, 35, 44, 83], 7, 8))
print(mayor([1,10, 25, 43, 21, 10, 2, 35, 44, 83], 2, 9))