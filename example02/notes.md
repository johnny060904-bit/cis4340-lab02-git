Rule: Input validation for command-line arguments

Problem:
The vulnerable version uses the command-line argument without checking it.

Fix:
The corrected version makes sure an argument was given and rejects unsafe file name patterns.