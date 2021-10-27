myList = [10,20,30]
totalSum=myList[0]+myList[1]+myList[2]
#print(myList)
print("Total Sum = ", totalSum)

print("--------------------------------------------------------------------------")


myList1=[]
##myList1.append("10")
##print(myList1[0])
totalSum1=0

for each in range(6):
    myList1.append(int(input("Please enter a number : ")))
    totalSum1+=myList1[each]

print("Total Sum = ",totalSum1)

print("--------------------------------------------------------------------------")


###---------------------------------------------------------------------------------------------####


numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)
