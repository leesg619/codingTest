def solution(n):
    list_n = sorted(str(n), reverse=True)
    return int(''.join(list_n))