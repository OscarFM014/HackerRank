# Complete the jumpingOnClouds function below.
def jumpingOnClouds(lista):
    pos = 0
    second = 0
    salto = 0
    while second < len(lista):
        if (second+2 < len(lista)):
            if (lista[second+2] == 0):
                pos = pos + 2
                salto = salto + 1
            else:
                pos = pos +1
                salto = salto + 1
            second = pos
    
    return salto

            
            
        
        

    
c = [0,0,1,0,0,0,0,1,0,0]
d = [0 ,0 ,0, 1 ,0 ,0]

print(jumpingOnClouds(c))
print(jumpingOnClouds(d))