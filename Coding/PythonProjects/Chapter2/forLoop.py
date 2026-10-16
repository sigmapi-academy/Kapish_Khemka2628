start = 1
end = 11
for i in range(start, end):
    print(i, end=' ')

print() 
# If I have to reverse the loop.
for i in range(end-1, start-1, -1):
    print(i, end=' ')

print()
for i in 'Kapish':
    print(i)

# Infinite loop 
while True:
    print('infinite')
    