Rule: Check for null before use

Problem:
The vulnerable version uses a string reference without checking if it is null.

Fix:
The corrected version checks for null before calling a method on the string. 