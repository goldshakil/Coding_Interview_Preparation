# Problem 3: GCD &LCM
# This program is the easiest and takes brute forces approach
# other ways to program it : 1) Remainder method 2) Substraction method
def main():
    number1=input("Input your first number: ")
    number2=input("Input your second number: ")
    i=1
    gcd=-1
    n1=0
    n2=0
    if(int(number1)<0 or int(number2)<0):
        print("LCM/GCD of negative numbers is the same as positive")
        n1=int(number1)*-1
        n2=int(number2)*-1
    else:
        n1=int(number1)
        n2=int(number2)

    while(i<=n1 and i<=n2):
        if(n1%i==0 and n2%i==0):
            gcd=i
        i+=1

    print("gcd is: "+str(gcd))
    print("lcm is: "+str(n1*n2/gcd))

main()
