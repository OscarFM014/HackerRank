def miniMaxSum(arr):
    arr.sort();

    max = sum(arr[1:])
    min = sum(arr[0:(len(arr)-1)])
    return max, min




arr = [1,2,3,4,5]
print (miniMaxSum(arr))