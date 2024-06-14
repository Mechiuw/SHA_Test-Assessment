# SHA Test Assessment

Repo for SHA Company at solo, central java, Indonesia.

## Description

This code consist by 3 questions
- to find how many times rusak() function recursively prints "hello";
- to find the return value of roger(x,y) function
- to make a program to map a string to count each (uppercase characters, lowercase characters, digit characters, and symbol characters

## Table of Contents
- [Code](#code)
- [Contact](#contact)
  
## Code
1) to find how many times rusak() function recursively prints "hello";
```java
public static void rusak(int n){
        if(n == 0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }

        rusak((int)n /2);
    }
```

2) to find the return value of roger(x,y) function
```java
public static int roger(int k, int b){
        if(b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);  // return
    }
```

3) to make a program to map a string to count each (uppercase characters, lowercase characters, digit characters, and symbol characters
```java
public static void validateString(String words){
        Map<String, Long> wordsMap = words.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(
                        c -> {
                            if(Character.isUpperCase(c)){
                                return "uppercase" ;
                            } else if(Character.isLowerCase(c)){
                                return "lowercase";
                            } else if(Character.isDigit(c)) {
                                return "digitcase";
                            } else {
                                return "other";
                            }
                        },
                        Collectors.counting()
                ));
        System.out.println("uppercase : " + wordsMap.getOrDefault("uppercase",0L));
        System.out.println("lowercase : " + wordsMap.getOrDefault("lowercase",0L));
        System.out.println("angka : " + wordsMap.getOrDefault("digitcase",0L));
        System.out.println("symbol : " + wordsMap.getOrDefault("other",0L));
    }
```
### Thankyou for the review 

## Contact
Contact me for more further development projects :
Github : [https://github.com/Mechiuw](https://github.com/Mechiuw)
Instagram : [https://www.instagram.com/mechiuw/](https://www.instagram.com/mechiuw/)
