n,k = map(int, input().split());
nNum = list(map(int, input().split()));
counter = 0;
for i in range(0,nNum.__len__()):
  if nNum[i] > 0 and nNum[i] >= nNum[k-1]:
    counter+=1;
print(counter);