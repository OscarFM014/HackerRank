# Complete the jumpingOnClouds function below.
def jumpingOnClouds(lista):
    pos = 0
    second = 0
    salto = 0

    while second < len(c):

        if (second < len(c)):
            if(c[second] == 0 ):
                salto = salto + 1
                pos = pos + 1 
                if (second+1 < len(c)):
                    if (c[second+1] == 0):
                        pos = pos + 1
        else:
            return salto

        second = pos
        second = second +1
    
    return salto

            
            
        
        

    
c = [0,0,1,0,0,0,0,1,0,0]
#d = [0,0,0,1,0,0]

print(jumpingOnClouds(c))
print(jumpingOnClouds(d))