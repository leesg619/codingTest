def solution(s):
    answer = ''
    list_str=list(s)
    list_str.sort()
    list_str.reverse()
    answer=''.join(list_str)
    return answer

print(solution('ASDxmqEpx'))