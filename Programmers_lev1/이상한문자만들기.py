def solution(s):
    words = s.split(' ')
    word_li = []
    result = []
    for word in words:
        word_li.append(list(word))
    for word in word_li:
        for i in range(0, len(word), 2):
            word[i]=word[i].upper()
        for i in range(1, len(word), 2):
            word[i]=word[i].lower()
        result.append(''.join(word))
    ans = ' '.join(result)
    return ans