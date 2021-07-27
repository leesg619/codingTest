def solution(x, n):
    answer=[]
    X=x+1-1
    for k in range(0,n):
        X = x*(k+1)
        answer.append(X)

    return answer