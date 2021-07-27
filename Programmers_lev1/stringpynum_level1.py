def solution(s):
    answer = True
    num_p,num_y= 0,0

    for temp in s:
        if temp=='y' or temp=='Y':
            num_y+=1
        elif temp=='p' or temp=='P':
            num_p+=1
    if num_y != num_p:
        answer = False
    return answer
# return s.lower().count('p') == s.lower().count('y') 다른이의 간결한 풀이
print(solution('helPoworld'))