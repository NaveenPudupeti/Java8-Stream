package java8StreamProgram;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		//int num = 153;
		Scanner n = new Scanner(System.in);             //1^3+5^3+3^3 = 153
		System.out.println("Enter your number:");
		int num = n.nextInt();
		int digits = String.valueOf(num).length();
		int sum = String.valueOf(num).chars()
				.map(ch ->(int)Math.pow(Character.getNumericValue(ch), digits))
				.sum();
		System.out.println("Is ArmStrong number:"+""+(sum==num));
	

	}

}

/*
 * ### **Java Program Explanation in Telugu**

```java
package java8StreamProgram;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        // User-defined input
        Scanner n = new Scanner(System.in);             
        System.out.println("Enter your number:");  // Console లో నంబర్ అడుగుతుంది
        int num = n.nextInt();  // User ఇచ్చిన నంబర్‌ను తీసుకోగల variable "num"
        
        // నంబర్‌లో ఉన్న డిజిట్‌ల సంఖ్యను లెక్కించడంలో సహాయపడే విధానం
        int digits = String.valueOf(num).length();
        
        // Stream API ద్వారా Armstrong నంబర్ నిర్ధారణ
        int sum = String.valueOf(num)
                     .chars() // Characters listకి నంబర్‌ను విడగొట్టడం
                     .map(ch -> (int) Math.pow(Character.getNumericValue(ch), digits)) 
                     // ప్రతీ డిజిట్‌ను దాని "digits" పైతరం వరకు పెంచడం
                     .sum();  // అన్ని మూలకాలు కలిపి మొత్తాన్ని పొందడం

        // ఫలితాన్ని ప్రింట్ చేస్తుంది: Armstrong నంబర్ అవుతుందా?
        System.out.println("Is ArmStrong number: " + (sum == num));
    }
}
```

---

### **Armstrong Number అంటే ఏమిటి?**
Armstrong నంబర్ అంటే ఒక నంబర్, దాని ప్రతి digit ను `digits` పైతరం వరకూ తీసుకుని వాటి మొత్తము ఆ నంబర్‌కు సమానం అవుతుందా అని చూసే నంబర్. ఉదాహరణకు:

#### **153**:
- \( 1^3 + 5^3 + 3^3 = 153 \)

#### **ప్రోగ్రామ్ వివరణ**:
1. **Scanner Class**: Console నుండి నంబర్ తీసుకోవడానికి ఉపయోగిస్తారు.
2. **Digits Length**: `String.valueOf(num).length()` ద్వారా నంబర్‌లో ఉన్న digitల సంఖ్య తెలుసుకుంటారు.
3. **Stream API (Java 8 Feature)**:  
   - `.chars()` ద్వారా ప్రతీ digit‌ను access చేస్తారు.
   - `Math.pow()` ద్వారా ప్రతీ digit‌ను లెక్కించి, దాని మొత్తం తీసుకుంటారు.
4. **Comparing the Sum**:  
   - `sum == num` అయితే అది Armstrong నంబర్ అవుతుంది.

#### **ఫలిత ఉదాహరణ**:
```
Enter your number:
153
Is ArmStrong number: true
```
 */
