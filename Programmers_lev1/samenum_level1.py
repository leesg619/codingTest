def solution(arr):
    answer=[]
    k=0
    for i in range (0,len(arr)-1):
        if arr[i]!=arr[i+1]:
            answer.append(arr[i])
        else:
            k+=1
    answer.append(arr[len(arr)-1])
    return answer

print(solution([1,1,3,3,1]))
