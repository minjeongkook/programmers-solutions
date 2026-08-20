def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def solution(numer1, denom1, numer2, denom2):
    numer = numer1 * denom2 + numer2 * denom1
    denom = denom1 * denom2
    g = gcd(numer, denom)

    return [numer//g, denom//g]