# Problem 2: Hanoi Tower
A=[3,2,1]
B=[]
C=[]
##########################################################################
#This function is for printing the correct zero positions
def zero_printer(original_array):
    temp_array=list(original_array)
    list_zero=[0]
    i=len(temp_array)
    while(i<3):
        temp_array.extend(list_zero)
        i+=1
    return temp_array

##########################################################################
#This function is reponsible for the actual solving
#this function is a recursive function that breaks down the problem into smaller one and moves disks from_tower
# A -> from_tower
# B -> to
# C -> Helper

def Hanoi_Solver(n,from_tower,to_tower,helper):

    if (n == 1):
        # Move the last disk to to_tower from from_tower
        #fix printing -> Extra Zeros
        disk=from_tower.pop()
        to_tower.append(disk)

        print("A: ",end="")
        print(zero_printer(A))
        print("B: ",end="")
        print(zero_printer(B))
        print("C: ",end="")
        print(zero_printer(C))
        print()
        return
    # 3 Steps:
    #Move All n-1 disks Except one to helper
    Hanoi_Solver(n-1, from_tower, helper, to_tower)
    #Move the biggest disk to the destination tower
    Hanoi_Solver(1,from_tower,to_tower,helper)
    #Move all n-1 disks from step 1 (helper) on top of the big one/destionation tower
    Hanoi_Solver(n-1, helper, to_tower, from_tower)

##########################################################################
#Driver Function
def main():
    number_of_disks=3
    #Starting state
    print("A: ",end="")
    print(zero_printer(A))
    print("B: ",end="")
    print(zero_printer(B))
    print("C: ",end="")
    print(zero_printer(C))
    print()
    #Goal: Move from_tower A to B
    Hanoi_Solver(number_of_disks,A,B,C)

main()
