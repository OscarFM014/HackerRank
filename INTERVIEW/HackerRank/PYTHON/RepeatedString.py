# Complete the repeatedString function below.
def repeatedString(s, n):
    aux = 0
    lista = {}
    lista = set()
    for i in s:
        lista.add(i)
        #if set(i%len(s)) == "a":
        #   aux+=1
    print (lista)
    return aux

print(repeatedString("aba", 10))