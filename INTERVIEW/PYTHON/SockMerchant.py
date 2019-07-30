
def sockMerchant(n, ar):
    aux = []
    cont = 0
    for i in range(len(ar)):
        if ar[i] in aux:
            aux.remove(ar[i])
            cont = cont + 1
        else:
            aux.append(ar[i])
    return (cont)



n = 6
ar = [1,2,3,3,4,1]

print(sockMerchant(6, ar))
