def solution(array, commands):
    answer = []
    for n in range(len(commands)):
        i=commands[n][0]
        j=commands[n][1]
        k=commands[n][2]
        temp = array[i-1:j]
        temp.sort()
        answer.append(temp[k-1])
    return answer

    #다른풀이
# def solution(array, commands):
#     return list(map(lambda x:sorted(array[x[0]-1:x[1]])[x[2]-1], commands))