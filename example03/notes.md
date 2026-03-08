Rule: Validate array indexes before use

Problem:
The vulnerable version uses an index that may be outside the array bounds.

Fix:
The corrected version checks that the index is valid before accessing the array. (i.e. if its in the array bounds)