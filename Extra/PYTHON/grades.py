def gradingStudents(grades):
    ans = []
    for i in range(len(grades)):
        next = grades[i]
        if grades[i] >= 38:
            while next % 5 !=0:
                next = next + 1
            if next - grades[i] < 3:
                ans.append(next)
            else:
                ans.append(grades[i])
        else:
            ans.append(grades[i])

    return ans
         





print (gradingStudents([73,67,38,33]))