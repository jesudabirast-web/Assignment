#collect father's age.
#collect son's age.
#multiply sons age by 2, then minus it by father's age.
#the result would be how many years he was twice as old and how many years he will be twice as old.
#if father's age is less than 1 and greater than 80, print invalid input.
 
age1 = int(input("Enter father's age: "))
age2 = int(input("Enter son's age: "))

if(age1 < 1 & age1 > 80):
	print("invalid input")

result = age2 * 2 - age1
print(result)




