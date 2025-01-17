package java8StreamArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergerSortedArrays {

	public static void main(String[] args) {
		
		int[] arr1 = {1,3,5,7,9,};
		int[] arr2 = {2,4,6,8,10};
		
		int[] mergerSorted = MergerSortedArrays(arr1,arr2);
		
		System.out.println(Arrays.toString(mergerSorted));

	}

	public static int[] MergerSortedArrays(int[] arr1, int[] arr2) {

		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				
				.sorted()
				.toArray();
	}

}

/*
### **MergerSortedArrays కోడ్‌ తెలుగులో వివరణ**

---

### **1. క్లాస్ డిక్లరేషన్**

```java
public class MergerSortedArrays {
```

- **public class MergerSortedArrays** అనే క్లాస్‌లో రెండు **sorted arrays** ను కలిపి సజావుగా క్రమబద్ధంగా ఉంచే కోడ్ రాస్తుంది.

---

### **2. మైన్ మెతడ్**

```java
public static void main(String[] args) {
```

- **main()** మెతడ్ ద్వారా ప్రోగ్రాం అమలవుతుంది.

---

### **3. రెండు సజావుగా ఉన్న ఆరేలను డిఫైన్ చేయడం**

```java
int[] arr1 = {1,3,5,7,9};
int[] arr2 = {2,4,6,8,10};
```

- **arr1** మరియు **arr2** అనే రెండు integer arrays కలిగి ఉంటాయి.
- **arr1** లోని ఎలిమెంట్లు సజావుగా ఉన్నవే: **1, 3, 5, 7, 9**  
- **arr2** లోని ఎలిమెంట్లు కూడా సజావుగా ఉన్నవే: **2, 4, 6, 8, 10**

---

### **4. మెర్జ్ మెతడ్ పిలిచే విధానం**

```java
int[] mergerSorted = MergerSortedArrays(arr1, arr2);
```

- **MergerSortedArrays(arr1, arr2)** అనే మెతడ్‌ను పిలిచి రెండు array లను కలిపి సజావుగా క్రమబద్ధంగా ఉంచుతాం.
- ఫలితాన్ని **mergerSorted** అనే array లో నిల్వ చేస్తుంది.

---

### **5. ఫలితాన్ని ప్రింట్ చేయడం**

```java
System.out.println(Arrays.toString(mergerSorted));
```

- **Arrays.toString()** ఉపయోగించి మెర్జ్ అయిన సజావుగా ఉన్న array ను ప్రింట్ చేస్తుంది.

---

### **6. MergerSortedArrays మెతడ్**

```java
public static int[] MergerSortedArrays(int[] arr1, int[] arr2) {
```

- ఈ మెతడ్ రెండు **arr1** మరియు **arr2** ను integer array లుగా తీసుకుని వాటిని కలిపి సజావుగా క్రమబద్ధంగా ఉంచుతుంది.

---

### **7. మెర్జ్ లాజిక్**

```java
return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
        .sorted()
        .toArray();
```

- **Arrays.stream(arr1)**:  
  **arr1** array ని ఒక **stream** లోకి మారుస్తుంది.
  
- **IntStream.concat()**:  
  **arr1** మరియు **arr2** streams ను కలిపి ఒక stream గా మార్చుతుంది.

- **.sorted()**:  
  ఆ streams లోని ఎలిమెంట్లను సజావుగా క్రమబద్ధం చేస్తుంది.

- **.toArray()**:  
  స్ట్రీమ్ ఫలితాన్ని array రూపంలో తిరిగి ఇస్తుంది.

---

### **8. ఫలితం (Example Output)**

```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```

---

### **కోడ్ ఉద్దేశం**

- ఈ ప్రోగ్రామ్ రెండు **sorted arrays** ను కలిపి సజావుగా క్రమబద్ధంగా ఉన్న ఒక కొత్త array ను ప్రింట్ చేస్తుంది.
*/