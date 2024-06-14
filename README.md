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
#### 1) to find how many times rusak() function recursively prints "hello";
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

it prints 1994 times (translate:indonesia)
Akan mengembalikan nilai sebanyak 1994 kali,
Karena :
1000 Hello n/2 -> 500 Hello n/2 -> 250 Hello n/2 -> 125 Hello n/2 -> 62 Hello n/2 -> 31 Hello n/2 -> 15 Hello n/2 -> 7 Hello n/2 -> 3 Hello n/2 -> 1 Hello
maka akan ada (1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1 ) = 1994 Hello

#### 2) to find the return value of roger(x,y) function
```java
public static int roger(int k, int b){
        if(b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);  // return
    }
```

it returns 4 (translate:indonesia)
Value yang di return ada 4 karena, 
roger(1 + 1 + 1 + 1) pemanggilan recursive => 4.

#### 3) to make a program to map a string to count each (uppercase characters, lowercase characters, digit characters, and symbol characters
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

it returns the mapped characters from string (translate:indonesia)
String yang dipakai : "pemrroRGGggramanDasarJ##a&&va18765-"
Validasi String yang didapat :
uppercase : 5
lowercase : 20
angka : 5
symbol : 5

### Thankyou for the review 
<br>
<br>
## Contact
Contact me for more further development projects :<br>
Github : [https://github.com/Mechiuw](https://github.com/Mechiuw)<br>
Instagram : [https://www.instagram.com/mechiuw/](https://www.instagram.com/mechiuw/)<br>
