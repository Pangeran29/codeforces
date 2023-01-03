answer = 0;
for i in range(1,26):
  if i%5 == 0: print();
  num = int(input());
  if num != 0: 
    answer = abs(13-i);
print(answer);