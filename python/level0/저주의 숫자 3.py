def solution(n):
    temp = 0

    for _ in range(n):
        temp += 1
        while temp % 3 == 0 or "3" in str(temp):
            temp += 1

    return temp