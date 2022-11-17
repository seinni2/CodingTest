def solution(sides):
    sum = 0
    max_num = 0
    
    for i in range(len(sides)):
        if max_num < sides[i]:
           max_num = sides[i]
        sum += sides[i]
    
            
    if max_num < sum-max_num:
        return 1 
    return 2
   