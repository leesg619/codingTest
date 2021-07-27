def solution(x):
    _li=list(map(int,str(x)))
    sum=0
    for n in _li:
        sum+=n
    return True if x%sum==0 else False