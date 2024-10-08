class Person:
    def __init__(self, firstname, lastname):
        self.firstname = firstname
        self.lastname = lastname
    
    def printName(self):
        print(self.firstname, self.lastname)


class Student(Person):
    def __init__(self, firstname, lastname, year):
        super().__init__(firstname, lastname)
        self.graduationYear = year
    
    def printDetails(self, year):
        print(self.firstname, self.lastname, self.graduationYear)

    def welcome(self):
        print('Welcome to the', self.firstname, self.lastname, 'to the class of', self.graduationYear)

x = Person("PErson", "test")
y = Student("abhishek", "chaudhary", 2024)

x.printName()
y.printDetails(2024)

y.welcome()