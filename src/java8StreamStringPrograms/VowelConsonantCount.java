package java8StreamStringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelConsonantCount {

    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public static void countVowelsAndConsonants(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }

        // Convert to lowercase to handle case-insensitivity
        String processedInput = input.toLowerCase().replaceAll("[^a-z]", "");

        // Predicate for vowels
        Predicate<Character> isVowel = c -> VOWELS.contains(c);

        Map<Boolean, Long> counts = processedInput.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(isVowel, Collectors.counting()));

        long vowelCount = counts.getOrDefault(true, 0L);
        long consonantCount = counts.getOrDefault(false, 0L);

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }
}

/*
### **VowelConsonantCount కోడ్ వివరణ తెలుగులో**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class VowelConsonantCount {
```

- **VowelConsonantCount** అనే క్లాస్‌లో ఒక string లోని **vowels (అచ్చు అక్షరాలు)** మరియు **consonants (హల్లుల అక్షరాలు)** సంఖ్యను లెక్కించడానికి అవసరమైన కోడ్ ఉంటుంది.

---

### **2. VOWELS డిక్లరేషన్**

```java
private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');
```

- **VOWELS** అనే స్థిరమైన జాబితాలో అన్ని చిన్న అక్షరాల **అచ్చు అక్షరాలు (a, e, i, o, u)** నిల్వ చేస్తాం.

---

### **3. `countVowelsAndConsonants()` మెతడ్**

```java
public static void countVowelsAndConsonants(String input) {
```

- ఈ మెతడ్ ఒక string తీసుకుని అందులోని అచ్చు అక్షరాలు మరియు హల్లుల సంఖ్యను లెక్కిస్తుంది.

---

### **4. ఖాళీ లేదా `null` string చెక్**

```java
if (input == null || input.isEmpty()) {
    System.out.println("Input string is empty or null.");
    return;
}
```

- **input** string ఖాళీగా లేదా **null** గా ఉంటే దాన్ని **చెక్ చేసి** మెసేజ్ ప్రింట్ చేస్తుంది.

---

### **5. అక్షరాలను ప్రాసెస్ చేయడం**

```java
String processedInput = input.toLowerCase().replaceAll("[^a-z]", "");
```

- **toLowerCase()**:  
  - అన్ని అక్షరాలను చిన్న అక్షరాలుగా మార్చుతుంది (case-insensitive).
  
- **replaceAll("[^a-z]", "")**:  
  - అక్షరాలు కాకుండా ఉన్న అన్ని గుర్తులను తొలగిస్తుంది (అంటే సంఖ్యలు, స్పేస్‌లు, ప్రత్యేక గుర్తులు తీసివేస్తుంది).

---

### **6. Vowel చెక్ చేసే `Predicate`**

```java
Predicate<Character> isVowel = c -> VOWELS.contains(c);
```

- **isVowel** అనే క్రమంలో ప్రతి అక్షరం అచ్చు అక్షరమా అని చెక్ చేస్తుంది.

---

### **7. అచ్చు మరియు హల్లుల లెక్కింపు**

```java
Map<Boolean, Long> counts = processedInput.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.partitioningBy(isVowel, Collectors.counting()));
```

#### **వివరణ**

- **processedInput.chars()**:  
  - string ని ప్రతి అక్షరం యొక్క **ASCII** విలువలుగా మార్చుతుంది.
  
- **mapToObj(c -> (char) c)**:  
  - **ASCII** విలువలను తిరిగి **Character** అక్షరాలుగా మార్చుతుంది.

- **collect(Collectors.partitioningBy(isVowel, Collectors.counting()))**:  
  - అక్షరాలను **వావల్స్ (true)** మరియు **కాన్సనెంట్స్ (false)** గా విభజించి వారి సంఖ్యను లెక్కిస్తుంది.

---

### **8. ఫలితాన్ని పొందడం**

```java
long vowelCount = counts.getOrDefault(true, 0L);
long consonantCount = counts.getOrDefault(false, 0L);
```

- **vowelCount** లో అచ్చు అక్షరాల సంఖ్య నిల్వ చేస్తుంది.  
- **consonantCount** లో హల్లుల సంఖ్య నిల్వ చేస్తుంది.

---

### **9. ఫలిత ప్రింట్**

```java
System.out.println("Vowels: " + vowelCount);
System.out.println("Consonants: " + consonantCount);
```

- అచ్చు అక్షరాల మరియు హల్లుల సంఖ్యను ప్రింట్ చేస్తుంది.

---

### **10. మైన్ మెతడ్**

```java
public static void main(String[] args) {
    String input = "Hello World!";
    countVowelsAndConsonants(input);
}
```

- **input** string ను `"Hello World!"` గా తీసుకుని **countVowelsAndConsonants()** మెతడ్ ద్వారా ప్రాసెస్ చేస్తుంది.

---

### **ఫలితం (Example Output)**

```
Vowels: 3  
Consonants: 7
```

---

### **కోడ్ ఉద్దేశం**

ఈ ప్రోగ్రామ్ **Java 8 Streams** మరియు **Functional Interfaces** ను ఉపయోగించి string లోని అచ్చు అక్షరాలు మరియు హల్లుల సంఖ్యను లెక్కించడానికి ఉపయోగపడుతుంది.
*/