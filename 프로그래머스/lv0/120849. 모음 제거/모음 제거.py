def solution(my_string):
    result = my_string
    
    for char in my_string:
        if char in "aeiou":
            result = result.replace(char, '')

    print(result)
    
    return result