from calculator import Calculator

class SimpleTestCalculator:

    @classmethod
    def setUp(self):
        self.calculator = Calculator()


    def test_add(self):
        assert self.calculator.add(10, 15) == 25, 'Error'


    def test_subtract(self):
        assert self.calculator.subtract(10,5) == 5, 'Error'


    def test_multiply(self):
        assert self.calculator.multiply(3,7) == 21, 'Error'


    def test_divide(self):
        assert self.calculator.divide(10,2) == 5, 'Error'
        assert self.calculator.divide(10,0) == None, 'Error'



t = SimpleTestCalculator()
t.setUp()
t.test_add()
t.test_subtract()
t.test_multiply()
t.test_divide()