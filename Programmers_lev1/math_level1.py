def solution(answers):
    answer = []
    a,b,c=[1,2,3,4,5],[2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5],[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    A_score,B_score,C_score=0,0,0
    for i in range (len(answers)):
        if answers[i] == a[i%5]:
            A_score+=1
        if answers[i] == b[i%16]:
            B_score+=1
        if answers[i] == c[i%10]:
            C_score+=1
    list1=[A_score,B_score,C_score]
    for i in range(3):
        if list1[i]>=max(list1):
            answer.append(i+1)
    return answer

print(solution([1,3,4,2,5,1,3,2,4,5,1,2,3,5,1,2,5,3]))
    # answer=filter(lambda x: x >= max(list1), list1)
    # A_score,B_score,C_score=1,2,3