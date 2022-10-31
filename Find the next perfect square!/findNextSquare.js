function findNextSquare(sq)
{
	return (Math.round(Math.sqrt(sq)) == Math.sqrt(sq)) ? (Math.sqrt(sq) + 1) * (Math.sqrt(sq) + 1) : -1;
}