#Just studying a recursive case
#Problem: If we have a staircase, how many ways are to get to the bottom if we have the change to
#make a one or two steps?

def ways(n):
    if n == 1 or n ==0:
        return 1
    else:
        return (ways (n-1) + ways(n-2))

def gettingWays(n):
    if n == 0 or n == 0:
        return 1
    num = [0] * (n+1)
    num[0] = 1
    num[1] = 1
    for i in range(2,n+1):
        num[i] = num [i-1] + num[i-2]
        print(num)
    return num[n]

staircase = 4
print(gettingWays(staircase))
