# Complete the countingValleys function below.
def countingValleys(n, s):
    aux = 0
    vallyes = 0
    for i in s:
        if i == "U":
            aux = aux + 1
        else:
            aux = aux - 1 

        if aux == 0 and i == "U":
            vallyes = vallyes + 1
    return vallyes




n = 8
s = "UDDDUDUU"
print countingValleys(n,s)