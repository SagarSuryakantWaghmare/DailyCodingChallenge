import re

# For build this is very hard
# Very very hard
pattern = r'^a[ab]*$'

# This is very easy
test_strings = ["a", "ab", "aab", "abb", "b", "abc"]

for string in test_strings:
    if re.match(pattern, string):
        print(f"'{string}' matches the pattern")
    else:
        print(f"'{string}' does not match the pattern")