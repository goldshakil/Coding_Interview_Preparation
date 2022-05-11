
# parent class
class person:
    def __init__(self, age, name):
        self.age = age
        self.name = name

    def print_hello(self):
        print("{} says hello".format(self.name))

    def print_items(self):
        print("{}'s age is {}".format(self.name, self.age))

# child class
# remember that any fuction you override is gone including the constructor
class student(person):
    def __init__(self, age, name, score):
        super().__init__(age, name)
        self.score = score

    def print_items(self):
        print("{}'s age is {} and he got {}".format(
            self.name, self.age, self.score))


def main():
    student_object = student(32, "Omar", 98)
    student_object.print_items() # child overridden method
    student_object.print_hello() # parent method


main()
