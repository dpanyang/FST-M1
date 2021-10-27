myDictionary = dict(mango=100, apple=200,orange=60, banana=45)

print("Disctionary value paris are : ",myDictionary)

check_fruit= input("Which fruit you are checking : ").lower()

if (check_fruit in myDictionary):
    print ("---fruit is available---")
else:
    print ("---fruit is not available---")

