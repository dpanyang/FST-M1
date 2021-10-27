myList=[]

for each in range(6):
    myList.append(int(input("Please enter a number : ")))
    
print("User List value : ",myList)

if (myList[0]==myList[-1]):
    print(True, " : First and last number of a list is same")
else:
    print(False, " : First and last number of a list is not same")

print("--------------------------------------------------------------------------")