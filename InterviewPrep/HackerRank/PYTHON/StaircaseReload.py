#Just studying a recursive case
#Problem: If we have a staircase, how many ways are to get to the bottom if we have a set of steps?
steps = [1,3,5]
def ways(n):
    if n == 0: return 1
    aux = 0
    for i in steps:
        if n-i >= 0:
            aux = aux + ways(n-i)
    return aux

def waysUp(n):
    if n == 0: return 1
    num = [0] * (n+1)
    num[0] = 1
    for i in (1, n):
        aux = 0
        for j in steps:
            if i-j >= 0:
                aux += num[i-j]
        num[i] = aux
    return aux




n = 2
print(waysUp(n))
