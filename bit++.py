num = int(input());
counter = 0;
for i in range(0,num):
  string = str(input());
  counter = counter+1 if string[1] == '+' else counter-1;
print(counter);
  