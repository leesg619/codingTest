def solution(a, b):
    answer = ''
    #%7==  0금 1토 2일 3월 4화 5수 6목
    days=b-1 #총 일수계산
    
    list1=[31,29,31,30,31,30,31,31,30,31,30,31]
    for i in range(a-1):
        days+=list1[i]
    
    yoil=['FRI','SAT','SUN','MON','TUE','WED','THU']
    answer = yoil[days%7]
    return answer

print(solution(5,24))