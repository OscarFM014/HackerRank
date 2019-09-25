# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    pos = 0
    salto = 0
    flag = False
    while pos < len(c): 
        #Two clouds
        if pos+2 < len(c):                  #is there a cloud? 
            if c[pos+2] == 0:               #save cloud
                salto = salto + 1
                pos = pos + 2
        else:
            return salto

        #One cloud
        if pos+1 < len(c):                #is there a cloud? 
            if c[pos+1] == 0:              #save cloud
                salto = salto + 1          #salto ++ 
                flag = True                          # it jump!
                pos = pos + 1
        else: 
            return salto

        

        
                    

    
c = [0,0,1,0,0,0,0,1,0,0]
d = [0,0,0,1,0,0]

print(jumpingOnClouds(c))
print(jumpingOnClouds(d))