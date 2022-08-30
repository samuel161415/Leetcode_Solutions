​The idea is we will have boolean array visited that will store the visited idxs; I also used map to store how many 'R' and 'D' left.I used while loop true to iterate the procedures.
if the current char is R I cheked the map if D is found or not . if not found(baned all) R is the winner. the reverse is also true;
I used boolean removeD and removeR , if they are true remove that Character( visited[i]==0); I used two count integers to specify how many of that character need to be removed before making removeD or removeR changing to false;
