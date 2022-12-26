number = int(input());

for i in range(number):
  word = str(input());
  if word.__len__() <= 10:
    print(word);
  else:
    print(f'{word[0]}{word.__len__()-2}{word[word.__len__()-1]}')