Klarna Qualified Assignment

This Assignment consists of 3 problems to solve

1) Write a function maskify, which will:
	Mask all digits (0-9) with #, unless they are first or last four characters.
	Never mask credit cards with less than 6 characters.
	Never mask non-digit characters.
	
2) Write a function which should take a number and return it as a string with the correct ordinal indicator suffix (in English).

	That is:

	numberToOrdinal(1) ==> '1st'
	numberToOrdinal(2) ==> '2nd'
	numberToOrdinal(3) ==> '3rd'
	numberToOrdinal(4) ==> '4th'
	... and so on
	For the purposes of this challenge, you may assume that the function will always
	be passed a non-negative integer. If the function is given 0 as an argument, it should return '0' (as a string).

	To help you get started, here is an excerpt from Wikipedia's page on Ordinal Indicators:

	st is used with numbers ending in 1 (e.g. 1st, pronounced first)
	nd is used with numbers ending in 2 (e.g. 92nd, pronounced ninety-second)
	rd is used with numbers ending in 3 (e.g. 33rd, pronounced thirty-third)
	th is used for all other numbers (e.g. 9th, pronounced ninth).
	
3) Create a calculator which evaluates expressions given to you in string format.

	The expressions are numbers and operators. Go through the expression left to right, keep track of the numbers, and when you come to an operator, apply it to the previous two numbers, and replace them with the result.

	Examples
		'3 2 1 - *', which is equivalent to 3 * (2 - 1), should evaluate to 3
		'7 4 5 + * 3 - 10 /' , which is equivalent to (7 * (4 + 5) - 3) / 10, should evaluate to 6.
		Note that for simplicity you may assume that there are always spaces between numbers and operations, e.g. '1 3 +' expression is valid, but '1 3+' isn't.

	Empty expression should evaluate to 0.
	It should support float numbers of format 3.5.
	If there are no operations in the input expression, it should return the last value of the expression.

	Valid operations are +, -, *, /.

	You may assume that there won't be exceptional situations (like applying operators without enough numbers or division by zero).


