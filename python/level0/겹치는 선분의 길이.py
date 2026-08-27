# my solution

def solution(lines):
    plus = abs(min(start for start, end in lines))
    max_end = max(end for start, end in lines)
    array = [0] * (max_end + plus + 1)

    for start, end in lines:
        start += plus
        end += plus

        for i in range(start, end):
            array[i] += 1

    return sum(1 for i in array if i >= 2)


# other solution

def other(lines):
    s1 = set(i for i in range(lines[0][0], lines[0][1]))
    s2 = set(i for i in range(lines[1][0], lines[1][1]))
    s3 = set(i for i in range(lines[2][0], lines[2][1]))
    return len((s1 & s2) | (s2 & s3) | (s1 & s3))