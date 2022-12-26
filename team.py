num = int(input());
counter = int();
for i in range(num):
  string = str(input());
  if string.count('1') >= 2:
    counter+=1;
print(counter);