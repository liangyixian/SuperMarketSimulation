shapeBody.setFillColor(black);
String []list = {"meat", "bread", "fish", "generic", "generic1", "generic2"};
ArrayList<String> possibilities = new ArrayList<String>(Arrays.asList(list));
java.util.Collections.shuffle(possibilities);
double res;
for(String poss: possibilities){
    res = uniform(0,1);
    int quantity = uniform_discr(1,4);
    if (res<=getParameterFromString(poss))
    {
        addObject(poss, quantity);
    }
}
res = uniform(0,1);
if(res<=needsInfoRate)
    needsInfo = true;
