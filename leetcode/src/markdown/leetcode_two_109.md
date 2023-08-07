### a

[https://leetcode.cn/problems/check-if-array-is-good/](https://leetcode.cn/problems/check-if-array-is-good/)

<img src="../images/two_109/two_109_a.png">

```java
class Solution {
    public boolean isGood(int[] nums) {
        int n =  nums.length - 1;
        int cnt = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (x > n) return false;
            if (n == x) {
              cnt ++;  
              continue;
            }
            if (set.contains(x)) return false;
            set.add(x);
        }
        return cnt == 2;
    }
}
```
### b

[https://leetcode.cn/problems/sort-vowels-in-a-string/description/](https://leetcode.cn/problems/sort-vowels-in-a-string/description/)

<img src="../images/two_109/two_109_b.png">

```java
class Solution {
    public String sortVowels(String s) {
        int[] arr = new int[10];
        String tar = "AEIOUaeiou";
        for (char c : s.toCharArray()) {
            int x = tar.indexOf(c);
            if (x >= 0) {
                arr[x] ++;
            }
        }

        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            int x = tar.indexOf(c);
            if (x >= 0) {
                for (int i = 0; i < 10; i ++) {
                    if (arr[i] != 0) {
                        arr[i] --;
                        res.append(tar.charAt(i));
                        break;
                    }
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
```
### c

[https://leetcode.cn/problems/visit-array-positions-to-maximize-score/](https://leetcode.cn/problems/visit-array-positions-to-maximize-score/)

<img src="../images/two_109/two_109_c.png">



### d


<img src="../images/two_109/two_109_d.png">