def solution(n):
    answer = 0
    lista=filter(lambda x : n%x==0 , range(1,n+1))
    for k in lista:
        answer+=k
    return answer
#return sum(filter(lambda x: num % x == 0, range(1, num + 1))) 줄이기
print(solution(5))