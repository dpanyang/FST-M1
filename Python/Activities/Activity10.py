myTuple=()  
myList=[]

for each in range(6):
    myList.append(int(input("Please enter a number : ")))  ### user input and created list

myTuple= tuple(myList) ## List converted into tuple
print(" Tuple values from user input : ",myTuple)


for each in myTuple:
    if (each%5==0):
        print(" Number that divided by 5 : ", each)




   