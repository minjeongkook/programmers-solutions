def solution(babbling):
    answer = 0
    word = ["aya", "ye", "woo", "ma"]

    for babb in babbling:
        for w in word:
                babb = babb.replace(w, " ") # aymaa 와 같은 케이스를 위해 " " 사용

        if not babb.strip():
            answer += 1

    return answer