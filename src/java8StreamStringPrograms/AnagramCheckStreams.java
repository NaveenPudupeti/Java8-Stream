package java8StreamStringPrograms;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheckStreams {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Count occurrences of each character
        return str1.toLowerCase().chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(
                        str2.toLowerCase().chars()
                                .boxed()
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                );
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}

/*
 * ### **AnagramCheckStreams కోడ్ వివరణ తెలుగులో**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class AnagramCheckStreams {
```

- **AnagramCheckStreams** అనే క్లాస్‌లో **string**లు అనాగ్రామ్స్ (అంటే, ఒక string లోని అక్షరాలు మళ్ళీ వేరే క్రమంలో ఉన్నప్పటికీ రెండూ ఒకే అర్థం కలిగే విధంగా ఉండే పద్ధతి) అవుతాయా అనే విషయాన్ని చెక్ చేసే కోడ్ ఉంటుంది.

---

### **2. `areAnagrams` మెతడ్**

```java
public static boolean areAnagrams(String str1, String str2) {
```

- ఈ మెతడ్ **str1** మరియు **str2** అనే రెండు string లను తీసుకుని అవి అనాగ్రామ్స్ కాదో చెక్ చేస్తుంది.
  
#### **చెక్ చేయడానికి ముందస్తు నియమాలు**

```java
if (str1 == null || str2 == null || str1.length() != str2.length()) {
    return false;
}
```

- **null చెక్**:  
  - **str1** లేదా **str2** **null** అయితే అనాగ్రామ్స్ కాదని తేలుస్తుంది.
  
- **length చెక్**:  
  - string ల పొడవులు సమానంగా లేకపోతే కూడా అవి అనాగ్రామ్స్ కావు.

---

### **3. స్ట్రీమ్ ద్వారా అక్షరాల occurrences కౌంట్ చేయడం**

```java
return str1.toLowerCase().chars()
           .boxed()
           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
           .equals(
               str2.toLowerCase().chars()
                   .boxed()
                   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
           );
```

#### **వివరణ**

- **str1.toLowerCase().chars()**  
  - **str1** లోని అన్ని అక్షరాలను చిన్న అక్షరాలుగా మార్చి **ASCII** విలువలుగా మార్చుతుంది.
  
- **.boxed()**  
  - ప్రిమిటివ్ **int** విలువలను **Integer objects** గా మారుస్తుంది.

- **collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))**  
  - ప్రతి అక్షరం ఎంత సార్లు వచ్చిందో కౌంట్ చేసి ఒక **Map** లో నిల్వ చేస్తుంది.  
  ఉదాహరణకు `"listen"` కి `{l=1, i=1, s=1, t=1, e=1, n=1}`.

- **equals()**  
  - **str1** మరియు **str2** లో అక్షరాల కౌంట్ మ్యాప్స్ సమానంగా ఉన్నాయా అనేది చెక్ చేస్తుంది.

---

### **4. `main` మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ప్రోగ్రాం అమలవుతుంది.

---

### **5. String డిక్లరేషన్**

```java
String str1 = "Listen";
String str2 = "Silent";
```

- **str1** మరియు **str2** అనే రెండు string లను అనాగ్రామ్ చెక్ చేయడం కోసం తీసుకున్నాం.

---

### **6. ఫలితాన్ని ప్రింట్ చేయడం**

```java
if (areAnagrams(str1, str2)) {
    System.out.println(str1 + " and " + str2 + " are anagrams.");
} else {
    System.out.println(str1 + " and " + str2 + " are not anagrams.");
}
```

- **areAnagrams(str1, str2)** మెతడ్ ఫలితం ఆధారంగా ఫలితాన్ని ప్రింట్ చేస్తుంది.

---

### **ఫలితం (Example Output)**

```
Listen and Silent are anagrams.
```

---

### **కోడ్ ఉద్దేశం**

- ఈ ప్రోగ్రామ్ **Java 8 Streams** ఉపయోగించి రెండు string లు అనాగ్రామ్స్ కావా కాదా అని చెక్ చేస్తుంది.
 */
