# Complete the countApplesAndOranges function below.
def countApplesAndOranges(s, t, a, b, apples, oranges):
    in_orange = 0
    in_apple = 0
    for i in range(len(apples)):
        if (apples[i] + a) <= t and (apples[i] + a) >= s:
            in_apple = in_apple + 1

    for i in range(len(oranges)):
        if (oranges[i] + b) <= t and (oranges[i] + b) >= s:
            in_orange = in_orange + 1
    
    print (in_apple) 
    return in_orange



#! s: integer, starting point of Sam's house location.
#! t: integer, ending location of Sam's house location.
#! a: integer, location of the Apple tree.
#! b: integer, location of the Orange tree.
#! apples: integer array, distances at which each apple falls from the tree.
#! oranges: integer array, distances at which each orange falls from the tree.


s = 7
t = 10
a = 4
b = 12
apples = [2, 3, -4]
oranges = [3, -2, -4]
print (countApplesAndOranges(s, t , a , b, apples, oranges))