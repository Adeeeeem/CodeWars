<?php
	function alphabet_position(string $s): string
	{
		$result = [];

		for ($i = 0; $i < strlen($s); $i++)
			if (preg_match("/^[a-zA-Z]$/", $s[$i]))
				$result[] = ord(strtoupper($s[$i])) - 64;
		return join(' ', $result);
	}
?>