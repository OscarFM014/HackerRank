# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    pos = 0
    salto = 0
    flag = True
    while pos < len(c):  
        #One cloud
        if pos+1 <= len(c):
            if c[pos+1] == 0:
                salto = salto + 1
                flag = True
                pos = pos + 1
        else:
            return salto 

        if pos+2 <= len(c):
            if c[pos+2] == 0:
                if flag:
                    salto = salto - 1
                    flag = False
                salto = salto + 1
                pos = pos + 1
        else:
            return salto        
        


c = [0,0,1,0,0,0,0,1,0,0]

print(jumpingOnClouds(c))