def solution(polynomial):
    poly_list = polynomial.split(" + ")
    poly, num = 0, 0
    answer = ""

    for p in poly_list:
        if "x" in p:
            if len(p) == 1:
                poly += 1
            else:
                poly += int(p[:-1])
        else:
            num += int(p)

    if poly == 0:
        return str(num)
    answer = "x" if poly == 1 else str(poly) + "x"

    if num != 0:
        answer += " + " + str(num)

    return answer