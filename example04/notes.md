Rule: Close resources after use

Problem:
The vulnerable version opens a Scanner for a file but never closes it.

Fix:
The corrected version uses try-with-resources so the Scanner is automatically closed. (a lot safer)