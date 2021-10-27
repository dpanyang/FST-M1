myList_01 = [1,2,3,4,5,6,7]
myList_02 = [8,9,10,11,12,13,14]

newList=[] ## will contain only odd numbers from the first list and even numbers from the second list

for each in range(len(myList_01)):
    if (myList_01[each]%2 !=0):
        newList.append( myList_01[each])

for each in range(len(myList_02)):
    if (myList_02[each]%2 ==0):
        newList.append( myList_02[each])

print("Numbers from fist list : ", myList_01)
print("Numbers from second list : ", myList_02)

print("Final list from first and second :  ",newList)


#########################################################################################################################


print ("--------------------------------------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx--------------------------------------")

# Given lists
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]

# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

# Declare a third list that will contain the result
thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)

# Print result
print("result List is:")
print(thirdList)


