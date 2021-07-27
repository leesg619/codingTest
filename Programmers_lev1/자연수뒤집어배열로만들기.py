def solution(n):
    result=reversed(list(str(n)))
    result_final=list(map(int, result))

    # return list(map(int, reversed(str(n)))) 이렇게한번에 진행가능
    return result_final