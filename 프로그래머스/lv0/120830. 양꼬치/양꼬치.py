def solution(n, k):
    answer = 0
    num = int(n/10)

    if n >= 10:
        answer = (n*12000) - ((num-k)*2000)
    else:
        answer = (n*12000) + (k*2000)
        
    return answer