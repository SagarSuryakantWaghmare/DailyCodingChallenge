# import re 
# val = input("Enter the Strings : ")

# is_string = re.search("",val)

# if is_string : 
#     print("Pass")
# else :
#     print("fail")

import re
target=r'^0[0+1]*1$'
# target=r'^0.1$'
input_string=["0001"]
for string in input_string:
    if re.match(target, string):
        print(f"{string} matches the input")
    else:
        print(f"{string} not matches the input")    