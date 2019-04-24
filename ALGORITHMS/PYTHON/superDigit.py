def superDigit(n, k):
    n = str(n)*k
    sum = 0
    for i in n:
        sum = sum + int(i)
    n = str(sum)
    if len(n) == 1:
        return n
    else:
        print (len(n)) 
        n = int(n) 
        superDigit(n,1);
    






print (superDigit(148,3))
