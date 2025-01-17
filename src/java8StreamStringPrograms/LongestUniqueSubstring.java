package java8StreamStringPrograms;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {

    public static String findLongestUniqueSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Map<Character, Integer> seenChars = new HashMap<>();
        int start = 0, maxLength = 0, maxStart = 0;

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);

            // If character is repeated, move the start pointer
            if (seenChars.containsKey(currentChar) && seenChars.get(currentChar) >= start) {
                start = seenChars.get(currentChar) + 1;
            }

            // Update the character's latest position
            seenChars.put(currentChar, end);

            // Check for a new max length
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return input.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = findLongestUniqueSubstring(input);
        System.out.println("Longest unique substring: " + result);
    }
}

/*
### **LongestUniqueSubstring కోడ్ వివరణ తెలుగులో**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class LongestUniqueSubstring {
```

- **LongestUniqueSubstring** అనే క్లాస్‌లో **string**లో ఎక్కువసేపు పునరావృతం కాని అక్షరాలతో ఉన్న substring ను కనుగొనే కోడ్ ఉంటుంది.

---

### **2. `findLongestUniqueSubstring()` మెతడ్**

```java
public static String findLongestUniqueSubstring(String input) {
```

- ఈ మెతడ్ **input** అనే string తీసుకుని అందులో పునరావృతం కాని అక్షరాల మెత్తం సుదీర్ఘమైన substring ను వెతుకుతుంది.
  
#### **ఎర్రర్ చెక్**

```java
if (input == null || input.isEmpty()) {
    return "";
}
```

- **null** లేదా ఖాళీ string అయితే ఖాళీ ఫలితాన్ని రిటర్న్ చేస్తుంది.

---

### **3. మాపింగ్ మరియు పాయింటర్లు**

```java
Map<Character, Integer> seenChars = new HashMap<>();
int start = 0, maxLength = 0, maxStart = 0;
```

- **seenChars**:  
  - ప్రతి అక్షరం చివరిసారి కనిపించిన స్థానం **key-value** జోడుగా నిల్వ చేస్తుంది.
  
- **start**:  
  - ప్రస్తుతం పునరావృతం కాని substring ప్రారంభ స్థానం.

- **maxLength**:  
  - ఇప్పటి వరకు కనుగొన్న సుదీర్ఘ substring యొక్క పొడవు.

- **maxStart**:  
  - ఎక్కువసేపు పునరావృతం కాని substring ప్రారంభ స్థాన సూచిక.

---

### **4. లూప్ లో substring చెక్**

```java
for (int end = 0; end < input.length(); end++) {
    char currentChar = input.charAt(end);
```

- ప్రతి అక్షరాన్ని **currentChar** లో నిల్వ చేసి loop కొనసాగుతుంది.

---

### **5. పునరావృతం చెక్**

```java
if (seenChars.containsKey(currentChar) && seenChars.get(currentChar) >= start) {
    start = seenChars.get(currentChar) + 1;
}
```

- **currentChar** ఆగమేఘాల మధ్య **seenChars** లో ఉంటే:
  - **start** స్థానాన్ని పునరావృతం అయిన అక్షరం తర్వాతికి మార్చుతుంది.

---

### **6. అక్షర స్థానం అప్‌డేట్**

```java
seenChars.put(currentChar, end);
```

- **currentChar** అక్షరానికి ప్రస్తుత **end** స్థానాన్ని నిల్వ చేస్తుంది.

---

### **7. సుదీర్ఘ substring చెక్**

```java
if (end - start + 1 > maxLength) {
    maxLength = end - start + 1;
    maxStart = start;
}
```

- **end - start + 1** ద్వారా substring పొడవును గుర్తించి **maxLength** మరియు **maxStart** ను అప్‌డేట్ చేస్తుంది.

---

### **8. ఫలితం రిటర్న్**

```java
return input.substring(maxStart, maxStart + maxLength);
```

- ఎక్కువసేపు పునరావృతం కాని substring ను రిటర్న్ చేస్తుంది.

---

### **9. మైన్ మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ప్రోగ్రాం అమలు కోసం ఉంది.

---

### **10. ఫలిత ప్రింట్**

```java
String input = "abcabcbb";
String result = findLongestUniqueSubstring(input);
System.out.println("Longest unique substring: " + result);
```

- **input** string లోని **Longest Unique Substring** ఫలితాన్ని ప్రింట్ చేస్తుంది.

---

### **ఫలితం (Example Output)**

```
Longest unique substring: abc
```

---

### **కోడ్ ఉద్దేశం**

ఈ ప్రోగ్రాం **Java Collections** మరియు **HashMap** ను ఉపయోగించి string లోని పునరావృతం కాని అక్షరాల సుదీర్ఘ substring ను కనుగొంటుంది.
*/