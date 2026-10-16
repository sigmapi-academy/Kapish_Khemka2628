prompt = "Give your operator: +, -, *, /, \n"
prompt += "//(lower division), %(remainder), **(exponential)\n"
oper = input(prompt)
n1 = int(input('Enter first number: '))
n2 = int(input('Enter second number: '))

match oper:
    case '+':
        print(f"sum = {n1+n2}")
    case '-':
        print(f"diff = {n1-n2}")
    case '*':
        print(f"product = {n1*n2}")
    case '/':
        print(f"divison = {n1/n2}")
    case "//":
        print(f"Quotient = {n1//n2}")
    case "%":
        print(f"remainder = {n1%n2}")
    case "**":
        print(f"{n1} to the power {n2} = {n1**n2}")
    case _:
        print("Wrong option selected")