def utopianTree(n):
    result = 0
    for i in range(0,n+1):
        if result % 2 == 0:
            result = result +1
        else: 
            result = result * 2
    return result 



print (utopianTree(2))


