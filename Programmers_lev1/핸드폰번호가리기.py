def solution(phone_number):
    new_number = "*"*(len(phone_number)-4)
    new_number += phone_number[-4:]
    return new_number