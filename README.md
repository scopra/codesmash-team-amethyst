# Team Amethyst - Codesmash Hackathon
**Team members:**
 - Selma Čopra
 - Rijad Kahriman
 - Edin Žiga

## Proposed solution
Our solution is based on pattern matching using regular expressions. 
The main idea is that the shoppingCart list is converted to a regular string called shoppingString, where each item is separated by a whitespace. 
Then, we iterate through each code string within the codeList, setting it as the pattern we want to match our shoppingString to. To solve the "anything" problem, we would just replace anything
with a value "\\w+" which would enable matching any word with it. When we match a codeString pattern to a portion of our shoppingString, we would remove everything from the beginning up until 
that matched part from the shoppingString, so we can avoid match overlaps. 
If a match is not found for a pattern, we return 0. Otherwise, the result is 1.

### Code Preview
```java
 public static int isBuyerWinner(List<String> codeList, List<String> shoppingCart) {
        if (codeList.isEmpty()) {
            return 1;
        } else if (shoppingCart.isEmpty()) {
            return 0;
        }

        String shoppingString = String.join(" ", shoppingCart);
        Pattern pattern;
        Matcher matcher;

        for (String codeString : codeList) {
            String patternString = codeString.replaceAll("anything", "\\\\w+");
            pattern = Pattern.compile(patternString);
            matcher = pattern.matcher(shoppingString);

            if (matcher.find()) {
                shoppingString = shoppingString.substring(matcher.end()).trim();
            } else {
                return 0;
            }
        }

        return 1;
    }
```

## Time and space complexity
 - **O(n * m * k)** - *Time Complexity*
 - **O(n + k)** - *Space Complexity*


The time complexity of the "isBuyerWinner" method can be broken down into several parts.  
The first two **if statements** take constant time O(1) to check for empty input lists.   
The **"String.join"** method takes O(n) time, where n is the total length of all the strings in the "shoppingCart" list.  
The loop that iterates over the elements of **"codeList"** takes O(m * k) time, where m is the length of "codeList" and k is the length of the longest string in "codeList".  
Each **"replaceAll"** method call takes O(k) time, where k is the length of the string being replaced.  
The **"Pattern.compile"** method call takes O(k) time to compile the pattern string.  
The **"matcher.find"** method call takes O(n * k) time, where n is the length of the "shoppingString" and k is the length of the pattern string.  
The **"shoppingString.substring"** method call takes O(n) time to extract the substring. 

The overall time complexity of the method is **O(m * k * n)**. 

The space complexity of the method is **O(n + k)**, where n is the length of the **"shoppingString"** and k is the length of the **"patternString"**. The method creates two new strings, shoppingString and patternString, and a Pattern object for each element in the codeList list.

## Installation
Clone the repository to your local machine using the command below, and run it through your preferred IDE. 😃
```git
 git clone https://github.com/scopra/codesmash-team-amethyst
```

## Licenses
Feel free to modify and use for whatever you wish. Give credit where credit is due.
