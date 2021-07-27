def solution(s):
    answer = ''
    k=len(s)
    if k %2==0:
        k=int(k/2)
        answer = s[k-1:k+1]
    else:
        k=int(k/2)
        answer = s[k:k+1]
    return answer

print(solution('abcd'))