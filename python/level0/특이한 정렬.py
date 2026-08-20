# my solution

from collections import defaultdict

def solution(numlist, n):
    answer = []
    numlist.sort(reverse=True)
    result_dict = defaultdict(list)

    for i in range(len(numlist)):
        result_dict[abs(numlist[i]-n)].append(numlist[i])

    result_tuple = sorted(result_dict.items())

    for d, value in result_tuple:
        answer += value
        
    return answer



# other solution

def other_solution(numlist, n):
    return sorted(numlist, key=lambda x: (abs(x - n), -x)) # 우선순위 정렬
