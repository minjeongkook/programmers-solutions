from collections import Counter

def solution(array):
    counter = Counter(array)
    max_two = counter.most_common(2)

    if len(max_two) == 1:
        return max_two[0][0]

    if max_two[0][1] == max_two[1][1]:
        return -1

    return max_two[0][0]