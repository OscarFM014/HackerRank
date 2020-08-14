def mergeSort(alist):
    if len(alist)>1:
        mid = len(alist)//2
        lefthalf = alist[:mid]
        righthalf = alist[mid:]

        mergeSort(lefthalf)
        mergeSort(righthalf)

        i=0
        j=0
        k=0
        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] < righthalf[j]:
                alist[k]=lefthalf[i]
                i=i+1
            else:
                alist[k]=righthalf[j]
                j=j+1
            k=k+1

        while i < len(lefthalf):
            alist[k]=lefthalf[i]
            i=i+1
            k=k+1

        while j < len(righthalf):
            alist[k]=righthalf[j]
            j=j+1
            k=k+1
    return alist

def balancear(list):
    list = mergeSort(list)
    uno = 0;
    dos = 0; 
    tam = len(list)-1
    for i in range(len(list)):
        if (i % 2 == 0):
            dos = list[i] + list[tam-i]
        else:
            uno = list[i] + list[tam-i]
    if uno > dos :
        return uno-dos
    elif dos > uno:
        return dos-uno
    return 0
        



loros = [2,5,10,10,15,20]
print(balancear(loros))

