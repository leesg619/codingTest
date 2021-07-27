def solution(s,n):
    answer=''
    for code in s:
        if code !=' ':
            new=ord(code)+n
            if new>ord('Z') and ord(code)<=ord('Z'):
                new-=26
            elif new>ord('z') and ord(code)<=ord('z'):
                new-=26
            answer+=chr(new)
        else:
            answer+=code
    return answer
print(solution('x Aa Zz',20)) 