**Explanation for Qn5 (Sum & Average of Array Elements in Java)**
In Java:
	You cannot write a for loop or perform calculations directly inside the class body (outside methods or constructors).
	Variables like sum and average cannot be directly calculated in the class body; they must be calculated inside a method or a constructor.
	In this program, we used a constructor to calculate the sum and average of the array elements when the object is created.
	The display() method is then used to print the sum and average.

So the flow is:
	Array elements → stored in elements[]
	Constructor → calculates sum and average using a loop
	display() → prints sum and average
