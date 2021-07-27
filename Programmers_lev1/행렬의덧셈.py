def solution(arr1, arr2):
    ans = []
    for i in range(len(arr1)):
        temp = []
        for j in range(len(arr1[0])):
            temp.append(arr1[i][j] + arr2[i][j])
        ans.append(temp)
    return ans
