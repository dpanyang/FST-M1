## number =[1,2,3,4,5,6,7,8,9,10]
while True:
    try:
        number=int(input("which multiplication table you want : "))
        break
    except:
        print("You entered non integer number")

##number = "a"

##if(isinstance(number,int)):
print("Multiplication table for number : ", number)
for i in range(1,11):
    print(number ," x " , i , "= ", number*i)
##else: 
    ##print("Entered non integer number")



