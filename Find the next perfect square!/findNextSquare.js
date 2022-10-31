function findNextSquare(sq)
{
	return (Math.round(Math.sqrt(sq)) == Math.sqrt(sq)) ? Math.pow((Math.sqrt(sq) + 1), 2) : -1;
}