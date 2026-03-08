Rule: Do not expose mutable internal data

Problem:
The vulnerable version returns the original array, so outside code can change it.

Fix:
The corrected version returns a copy of the array instead.