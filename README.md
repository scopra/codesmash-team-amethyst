# codesmash-team-amethyst

Our solution is based on pattern matching using regular expressions. 
The main idea is that the shoppingCart list is converted to a regular string called shoppingString, where each item is separated by a whitespace. 
Then, we iterate through each code string within the codeList, setting it as the pattern we want to match our shoppingString to. To solve the "anything" problem, we would just replace anything
with a value "\\w+" which would enable matching any word with it. When we match a codeString pattern to a portion of our shoppingString, we would remove everything from the beginning up until 
that matched part from the shoppingString, so we can avoid match overlaps. 
If a match is not found for a pattern, we return 0. Otherwise, the result is 1.
