Rule: Compare strings using equals

Problem:
The vulnerable version uses == for strings, which compares references instead of content.

Fix:
The corrected version uses equals to compare the actual string values.