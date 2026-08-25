def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

# my solution

def solution(a, b):
    g = gcd(a, b)
    b //= g

    i = 2
    while i <= b:
        if b % i == 0:  # i가 b의 약수라면
            if i != 2 and i != 5:  # 2와 5 이외의 약수가 존재하면 종료
                return 2
            else:  # i가 2 또는 5라면 b에서 i를 제거
                b //= i
        else:  # i가 b의 약수가 아니라면 다음 약수를 찾기 위해 i 증가
            i += 1
    return 1


# other solution

def solution(a, b):
    b //= gcd(a, b)
    while b % 2 == 0:
        b //= 2
    while b % 5 == 0:
        b //= 5
    return 1 if b==1 else 2