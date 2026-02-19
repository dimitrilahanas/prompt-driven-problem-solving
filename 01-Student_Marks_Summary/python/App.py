totalInputNums = 0
totalMarks = 0

mark = int(input("Enter mark: "))
while mark != -1:
    totalMarks += mark
    totalInputNums += 1
    mark = int(input("Enter mark: "))

if totalInputNums == 0:
    print("No marks were entered.")
else:
    average = totalMarks / totalInputNums
    print(f"Total mark value = {totalMarks}")
    print(f"Total inputted marks = {totalInputNums}")
    print(f"Average mark = {average}")