Rule: Check command-line arguments before use

Problem:
The vulnerable version assumes an argument exists and may crash if none is given.

Fix:
The corrected version checks that at least one argument was provided.