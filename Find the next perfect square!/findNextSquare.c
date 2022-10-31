#include <stdio.h>
#include <math.h>

long int findNextSquare(long int sq)
{
	return (round(sqrt(sq)) == sqrt(sq)) ? pow((sqrt(sq) + 1), 2) : -1;
}