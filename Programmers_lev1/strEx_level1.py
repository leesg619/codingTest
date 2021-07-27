def solution(s):
    answer = True
    for temp in s:
        if ord(temp)>=ord('A') and ord(temp)<=ord('z'):
            answer=False
        else:
            continue
    if len(s)!=4 and len(s)!=6:
        answer = False
    return answer
#return s.isdigit() and len(s) in (4, 6) isdigit은 숫자로이루어져있는지확인
print(solution('As42'))
print(solution('1234'))