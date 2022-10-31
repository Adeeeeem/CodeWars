#include <stdio.h>
#include <math.h>

long int findNextSquare(long int sq)
{
	return (round(sqrt(sq)) == sqrt(sq)) ? (long) (sqrt(sq) + 1) * (long) (sqrt(sq) + 1) : -1;
}