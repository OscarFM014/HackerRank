class Node:
  def __init__ (self,value):
    self.value = value
    self.next = None



#metodo consultor es el init

#declarando nodos
nodo1 = Node(5)
nodo2 = Node(6)
nodo3 = Node(7)

#apuntando nodos
nodo2.next = nodo3
nodo1.next = nodo2


auxiliar = nodo1
while auxiliar != None:
    print(auxiliar)
    auxiliar = auxiliar.next







#print (nodo1.value)
#print (nodo1.next.value)
#print (nodo1.next.next.value)


