/*
 * Name: Esther Soon
 * Class: CMSC 204-38176
 * Instructor: Farnaz Eivazi
 * Date: 2/8/2022
*/

public class ArraySum {
	public int sumOfArray (Integer[] a, int index) {
		if (index<0) {
			return 0;
		}
		return sumOfArray(a,index-1)+ a[index];
	}
}
