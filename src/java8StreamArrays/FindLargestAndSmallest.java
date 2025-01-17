package java8StreamArrays;

import java.util.Arrays;
import java.util.Optional;

public class FindLargestAndSmallest {

	public static void main(String[] args) {

		int[] arr = {1,10,11,20,22,30,33,40,44,50,55,60,66,70};
		
		FindLargestAndSmallest(arr);
	}


	public static void FindLargestAndSmallest(int[] arr) {
  
		Optional<Integer> min =Arrays.stream(arr)
				.boxed()
				. min(Integer::compareTo);
		
		Optional<Integer> max = Arrays.stream(arr)
				.boxed()
				.max(Integer::compareTo);
		
		
		min.ifPresent(minValue -> System.out.println("SmallestValue:"+minValue));
		
		max.ifPresent(maxValue -> System.out.println("LargestValue:"+maxValue));
		
				
	}	

}
/*
 * **Java కోడ్‌ వివరణ: Find Largest and Smallest ఎలిమెంట్**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class FindLargestAndSmallest {
```

- **public class** అంటే ఇది ఒక ప్రధాన క్లాస్.
- **FindLargestAndSmallest** అనేది క్లాస్ పేరు.

---

### **2. మైన్ ఫంక్షన్**

```java
public static void main(String[] args) {
    int[] arr = {1,10,11,20,22,30,33,40,44,50,55,60,66,70};
    
    FindLargestAndSmallest(arr);
}
```

- **main()** ఫంక్షన్ ప్రోగ్రాం ఎక్కడి నుంచి మొదలవ్వాలో నిర్ణయిస్తుంది.
- **arr** అనే integer array లో కొన్ని విలువలను ముందే డిఫైన్ చేస్తారు.
- **FindLargestAndSmallest(arr)** అనే మెతడ్‌ను పిలుస్తుంది, ఇది array లోని అత్యల్ప మరియు అత్యధిక విలువలను కనుగొంటుంది.

---

### **3. FindLargestAndSmallest మెతడ్**

```java
public static void FindLargestAndSmallest(int[] arr) {
```

- ఈ మెతడ్‌కు **arr** అనే integer array ఆర్గుమెంట్‌గా పంపుతారు.
  
---

### **4. అత్యల్ప విలువ కనుగొనడం**

```java
Optional<Integer> min = Arrays.stream(arr)
    .boxed()
    .min(Integer::compareTo);
```

- **Arrays.stream(arr)**:  
  - **arr** లోని ఎలిమెంట్లను స్ట్రీమ్ రూపంలో మారుస్తుంది.
  
- **.boxed()**:  
  - **int** వంటి primitive డేటా టైప్‌ను **Integer** (object) గా మార్చుతుంది.
  
- **.min(Integer::compareTo)**:  
  - ఈ ఆపరేషన్ array లో అత్యల్ప విలువను కనుగొంటుంది.
  
- **min** ఒక **Optional<Integer>** అవుట్‌పుట్‌ను ఇస్తుంది, అంటే అది ఖచ్చితమైన విలువ లేదా ఖాళీ అయి ఉండవచ్చు.

---

### **5. అత్యధిక విలువ కనుగొనడం**

```java
Optional<Integer> max = Arrays.stream(arr)
    .boxed()
    .max(Integer::compareTo);
```

- ఇదే విధంగా **max()** ఆపరేషన్ అత్యధిక విలువను కనుగొంటుంది.

---

### **6. విలువలను ప్రింట్ చేయడం**

```java
min.ifPresent(minValue -> System.out.println("Smallest Value: " + minValue));
max.ifPresent(maxValue -> System.out.println("Largest Value: " + maxValue));
```

- **min.ifPresent()** మరియు **max.ifPresent()** ఉపయోగించి **Optional** లోని విలువలను ప్రింట్ చేస్తారు.
- ఇది విలువ అందుబాటులో ఉన్నప్పుడు మాత్రమే ప్రింట్ చేయడానికి సహాయపడుతుంది.

---

### **ఫలితం (Example Output)**

```
Smallest Value: 1  
Largest Value: 70
```

---

### **కోడ్ ఉద్దేశం**

- ఈ ప్రోగ్రాం array లోని అత్యల్ప మరియు అత్యధిక విలువలను కనుగొని ప్రింట్ చేస్తుంది.

 */

