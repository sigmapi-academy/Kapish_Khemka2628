for i in range(1, 10):
    if i % 5 == 0:
        continue
    print(i)
    i = i + 2
else:
    print('loop is over')