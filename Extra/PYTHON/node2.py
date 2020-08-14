#Clases
class Node:
  def __init__ (self,value):
    self.value = value
    self.next = None

class LinkedList:
    def __init__(self, head):
        self.head = head


    def final(self,numero):
        """Agrega un nodo al final del todo """
        nodo = self.head
        while nodo != None:
            if nodo.next == None:
                nodo.next = Node(numero)
                break
            else:
                nodo = nodo.next


    def borrar(self,numero):
        """Borra cualquier nodo"""
        nodo = self.head
        if nodo.value == numero:
            self.head = nodo.next
        else:
            while nodo.value != numero:
                if nodo.next.value == numero:
                    nodo.next = nodo.next.next
                    break
                else:
                    nodo = nodo.next


    def imprimir(self):
        """Imprime todos los nodos """
        auxiliar = self.head
        lista = []
        while auxiliar != None:
            lista.append(auxiliar.value)
            print(auxiliar.value)
            auxiliar = auxiliar.next
        #self.reversa(lista)


    def reversa(self,valor):
        """Revierte solo los datos con una lista """
        nodo = self.head
        for i in valor[::-1]:
            print (i)

    def printReverse(self,nodo):
        """Revertir nodo forma noob1"""
        if nodo == None:
            return
        self.printReverse(nodo.next)
        print(nodo.value)


    def printNormal(self,nodo):
        """La imprime en orden de nuevo"""
        if nodo == None:
            return
        print (nodo.value)
        self.printNormal(nodo.next)


    def revertir(self):
        """Revierte listas por apuntadores """
        current = self.head
        last = None
        while current != None:
            siguiente = current.next
            current.next = last
            last = current
            if siguiente == None:
                self.head = current
            current = siguiente












#Programa principal
nodo1 = Node(5)
lista = LinkedList(nodo1)
agregado = 8
lista.final(6)
lista.final(7)
lista.final(8)
lista.final(9)
lista.borrar(5)
lista.revertir()
lista.imprimir()
lista.printReverse(nodo1)
lista.printNormal(nodo1)
