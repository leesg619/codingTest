def solution(arr, divisor):
    answer = []
    answer = [num*1 for num in arr if num % divisor == 0 ]
    answer.sort()
    if len(answer)==0:
        answer.append(-1)
    return answer
print(solution([3,13,5,16,2,10],5))