def print_array(arr):

    for i in range(len(arr)):
        for j in range(len(arr[0])):
            # print(arr[i][j], end=" ")
            print("%-4d" % (arr[i][j]), end="")  # formatted printing
        print()
        
        

def main():
    rows = int(input())
    cols = int(input())
    a = []

    num = 1
    for i in range(rows):
        row = []
        for j in range(cols):
            row.append(num)
            num += 1
        a.append(row)

    print_array(a)


main()
