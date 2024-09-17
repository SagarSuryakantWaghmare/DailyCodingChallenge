# import re

# # For build this is very hard
# # Very very hard
# pattern = r'^X.*Y$'

# # This is very easy
# test_strings = ["X", "XY"]

# for string in test_strings:
#     if re.match(pattern, string):
#         print(f"'{string}' matches the pattern")
#     else:
#         print(f"'{string}' does not match the pattern")
# import re

# For build this is very hard
# second last is 1
# Very very hard
# pattern = r'^[01]*1[01]$'

# # This is very easy
# test_strings = ["1010", "01010"]

# for string in test_strings:
#     if re.match(pattern, string):
#         print(f"'{string}' matches the pattern")
#     else:
#         print(f"'{string}' does not match the pattern")
# import re
# pattern=r'^[01]*01[01]*$'
# test_string=['01','110']
# for string in test_string:
#     if re.match(pattern,string):
#         print(f"{string} matches the pattern")
#     else:
#         print(f"{string} does not match the pattern")    

# starts with hello and ends with world
# import re
# pattern=r'^(hello).(world)$'
# test_string=['hello world','Hello world bye']
# for string in test_string:
#     if re.match(pattern,string):
#         print(f"{string} matches the pattern")
#     else:
#         print(f"{string} does not match the pattern") 

# Containing the a or b
# import re
# pattern =r'[ab]+'
# test_string=['ababab','ababababababababababababab','a','']
# for string in test_string:
#     if re.match(pattern,string):
#         print(f"{string } matches the pattern")
#     else:
#         print(f"{string} does not matches the pattern")

# String that string starts and ends with same digit
# import re
# pattern =r'^(\d).*\1$'
# test_string=['101','10']
# for string in test_string:
#     if re.match(pattern,string):
#         print(f"{string } matches the pattern")
#     else:
#         print(f"{string} does not matches the pattern")

# string ones small character
# import re
# pattern =r'^[^a-z]*[a-z][^a-z]*$'
# test_string=['Abs','AsS']
# for string in test_string:
#     if re.match(pattern,string):
#         print(f"{string } matches the pattern")
#     else:
#         print(f"{string} does not matches the pattern")


# Starts with t and ends with z and minimum one e
# import re
# pattern=r"^[9,8]*[0-9]*0$"
# re.search()
# # pattern =r'^t[tze+]*z$'
# test_string=['tez','ttteeezzzzzzzzeez']
# for string in test_string:
#     if re.match(pattern,string): 
#         print(f"{string } matches the pattern")
#     else:
#         print(f"{string} does not matches the pattern")


# string that 0 followed by 1

import re

pattern = r"^01"

test_strings = ['10111', '01']
for string in test_strings:
    if re.match(pattern, string): 
        print(f"{string} matches the pattern")
    else:
        print(f"{string} does not match the pattern")


