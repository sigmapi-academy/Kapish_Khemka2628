single_quote_str = 'Hello'
double_quote_str = "World"
multiline_string = """This is a string
that spans across
multiple lines """

text = 'Python'

# Forward Indexing: P=0, y=1, t=2, h=3, o=4, n=5
# Backward Indexing: n=-1, o=-2, h=-3, t=-4, y=-5, P=-6

first_char = text[0] # 'P'
last_char = text[-1] # 'n'

# Slicing (Extracting parts of a string)
# Syntax: string[start:stop:step] (Stop index is excluded)
substring = text[0:4]   # 'Pyth'
skipped_str = text[::2] # 'Pto' (every second character)
reversed_str = text[::-1] # 'nohtyP'

message =  "Hello"

message = "Y" + message[1:] #'Yello'

name = "Alice"
age = 25
# Modern. f-String approach (recommended)
formatterd_str = f"My name is {name} and I am {age} years old"

