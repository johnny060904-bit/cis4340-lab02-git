Secure coding concept: Close resources after use

Problem:
The program opens a Scanner for a file but does not close it.

Fix:
The fixed version uses try-with-resources so the Scanner closes automatically. (a lot safer)