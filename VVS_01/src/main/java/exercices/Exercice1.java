package exercices;

public class Exercice1 {

	// ------------------------------------------------------------------------
	// Question a:
	// Identify the faults and what would be the correct code in ArrayOperations methods.
	/* 
		Done in class ArrayOperations 
	*/

	// ------------------------------------------------------------------------
	// Question b:
	// If possible, identify a test case that does not execute the fault.
	// Reachability condition not met.
	/*
		numZeros test case: Not possible.
		
		findLast test case: x = null, y = 0
		
		lastZero test case: x = null
		
		countPositive test case: x = { }
		
		oddOrPos test case: x = { }
	*/
	
	// ------------------------------------------------------------------------
	// Question c:
	// Identify a test case that leads to failure.
	// Reachability, infection and propagation conditions met.
	/*
		numZeros test case: x = {0, 1, 2, 3}
		
		findLast test case: x = {0, 0, 1, 2, 3}, y = 0
		
		lastZero test case: x = {0, 1, 2, 3, 0}
		
		countPositive test case: x = {0, 1, 2, 3}
		
		oddOrPos test case: x = {-1, 0, 1, 2, 3}
	*/

	// ------------------------------------------------------------------------
	// Question d:
	// If possible, identify a test case that results in an error, but not a failure.
	// Propagation condition not met.
	/*
		numZeros test case: Not possible.
		
		findLast test case: Not possible.
		
		lastZero test case: Not possible.
		
		countPositive test case: Not possible.
		
		oddOrPos test case: Not possible.
	*/
	
	// ------------------------------------------------------------------------
	// Question e:
	// If possible, identify a test case that executes the fault but does not 
	// lead to an error state.
	// Infection condition not met.
	/*
		numZeros test case: x = {1, 0, 0, 2}
		
		findLast test case: x = {-1, 0, 1, 2, 3}, y = 0
		
		lastZero test case: x = {0}
		
		countPositive test case: x = {1, 2, 3}
		
		oddOrPos test case: x = {0, 1, 2, 3}
	*/
}
