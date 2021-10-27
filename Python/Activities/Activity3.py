gameOption1 = "Rock"
gameOption2 = "Scissors"
gameOption3 = "Paper"

gameUser1 = input("Player 1 is: ")
gameUser2 = input("Player 2 is: ")

##print("Player 1 is: "+ gameUser1)
##print("Player 2 is: "+ gameUser2)

gameUser1_selectedOption = input(gameUser1+", Please select one of the game option :"+gameOption1+"/"+gameOption2+"/"+gameOption3+": ")
gameUser2_selectedOption = input(gameUser2+", Please select one of the game option :"+gameOption1+"/"+gameOption2+"/"+gameOption3+": ")

if gameUser1_selectedOption==gameUser2_selectedOption:
    print("Game draw")
elif gameUser1_selectedOption==gameOption1:
    if gameUser2_selectedOption==gameOption2:
        print(gameOption1+" beats "+gameOption2)
    else:
        print(gameOption3+" beats "+gameOption1)


elif gameUser1_selectedOption==gameOption2:
    if gameUser2_selectedOption==gameOption3:
        print(gameOption2+" beats "+gameOption3)
    else:
        print(gameOption1+" beats "+gameOption2)

elif gameUser1_selectedOption==gameOption3:
    if gameUser2_selectedOption==gameOption1:
        print(gameOption1+" beats "+gameOption3)
    else:
        print(gameOption2+" beats "+gameOption3)

else:
    print("----------------Wrong input : Invalide input for the game option (valid options are -"+gameOption1+"/"+gameOption2+"/"+gameOption3+" ) : --------------------")
        
