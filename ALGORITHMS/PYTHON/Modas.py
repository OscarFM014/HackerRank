def frecuencia(sequ):
    frequ = {}
    fmax = 0
    for k in sequ:
        if k in frequ:
            frequ[k] += 1
        else:
            frequ[k] = 1
            if (frequ[k] >= fmax):
                fmx = frequ[k]
    modas = []
    for k in frequ:
        if(frequ[k]==fmax):
            modas.append(k)
    modas.sort()
    modas = ''.join(str(e) for e in modas)
    return modas



print(frecuencia([1,1,2,2,3,3]))
    