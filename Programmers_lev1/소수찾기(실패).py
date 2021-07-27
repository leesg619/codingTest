def solution(n):
    answer = 0
    ans=[]
    for k in range(2, n + 1):
        for j in range(2, k):
            if k % j == 0:
                break
        answer +=1


    return answer
print(solution(10))