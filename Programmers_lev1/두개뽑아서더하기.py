def solution(numbers):
    ans = set()
    length = len(numbers)
    for i in range(length):
        for j in range(i+1, length):
            ans.add(numbers[i] + numbers[j])
    ans = list(ans)
    return sorted(ans)