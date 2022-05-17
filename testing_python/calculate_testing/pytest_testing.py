"""PYTEST"""


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


"""pytest pytest_testing.py"""


"""
daniilnishpal@MacBook-Pro-Daniil testing_python % pytest pytest_testing.py
========================================================================= test session starts =========================================================================
platform darwin -- Python 3.9.10, pytest-7.1.2, pluggy-1.0.0
rootdir: /Users/daniilnishpal/Desktop/testing_python
collected 0 items                                                                                                                                                     

======================================================================== no tests ran in 0.00s ========================================================================
"""
