def solution(dots):
    for i in range(3):
        for j in range(i + 1, 4):
            temp = dots[:]
            dot1, dot2 = temp[i], temp[j]
            temp.remove(dot1)
            temp.remove(dot2)
            dot3, dot4 = temp[0], temp[1]

            dx1, dy1 = dot2[0] - dot1[0], dot2[1] - dot1[1]
            dx2, dy2 = dot4[0] - dot3[0], dot4[1] - dot3[1]
            if (dy1 / dx1) == (dy2 / dx2):
                return 1
    return 0


# 조금 더 간단하게

def other(dots):
    for i in range(3):
        for j in range(i+1, 4):
            other = [k for k in range(4) if k != i and k != j]

            x1, y1 = dots[i]
            x2, y2 = dots[j]
            x3, y3 = dots[other[0]]
            x4, y4 = dots[other[1]]

            if (y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1):
                return 1
    return 0