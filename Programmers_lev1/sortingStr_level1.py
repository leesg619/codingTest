def solution(strings, n):
    answer = sorted(sorted(strings), key = lambda x : (x[n])) # 그냥 strings말고 sorted strings로해야 완벽정렬
    return answer
    # key 인자에 함수를 넘겨주면 해당 함수의 반환값을 비교하여 순서대로 정렬한다. 
    # c = sorted(a, key = lambda x : x[0])
    #  # c = [(0, 1), (1, 2), (3, 0), (5, 1), (5, 2)]

print(solution(['abdx','abda','abdc'] , 2))