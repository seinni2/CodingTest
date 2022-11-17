def solution(sides):
    sum = 0
    sides.sort()
    
    if sides[2] < sides[0] + sides[1]:
        return 1
    return 2

   