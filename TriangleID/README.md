# Triangle Identification App

This application receives the length of 3 sides and deteremins if the triangle is equilateral, isosceles or scalene.
Note that the length can be a double and it needs to be a positive number.


# Instructions

Run the TriangleID\src\TriangleInput.java file.
Insert the 3 different side lengths and press the *Check* button to see if a triangle can be formed and if so, what type of triangle is formed.

# Tests

In the TriangleID\Tests directory a variety of tests can be found.

* noTriangleTest(), tests if an input such as (1,2,3) will show the error message that a triangle cannot be formed.
..* isScaleneTest(), tests if an input such as (2,3,4) will show the correct message of a scalene triangle formed.
..* testNumberFormatException(), tests if an input such as (a,2,3) will show the error message throw and exception.
..* noIsoscelesTest(), tests if an input such as (1,2,3) can form an isosceles triangle.
..* isIsoscelesTest(), tests if an input such as (2,2,3) can form an isosceles triangle.
..* noEquilateralTest(), tests if an input such as (2,2,3) can form an equilateral triangle.
..* isEquilateralTest(), tests if an input such as (2,2,2) can form an equilateral triangle.

# Author

Christos Zoupis-Schoinas xzoupis@gmail.com
