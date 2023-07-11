### a

[https://leetcode.cn/problems/find-maximum-number-of-string-pairs/](https://leetcode.cn/problems/find-maximum-number-of-string-pairs/)

<img src="../images/two_107/a_two_107.png">

```java
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();

        int res = 0;
        for (int i = 0; i < words.length; i ++) {
            String a = words[i];
            if (set.contains(a)) {
                res ++;
                set.remove(a);
            } else {
                set.add(new StringBuilder(a).reverse().toString());
            }
        }
        return res;
    }
}
```

### b

[https://leetcode.cn/problems/construct-the-longest-new-string/description/](https://leetcode.cn/problems/construct-the-longest-new-string/description/)

<img src="../images/two_107/b_two_107.png">

```java
class Solution {
    public int longestString(int x, int y, int z) {
        return (Math.min(x, y) * 2 + (x != y ? 1 : 0) + z) * 2;
    }
}
```

### c

[https://leetcode.cn/problems/decremental-string-concatenation/](https://leetcode.cn/problems/decremental-string-concatenation/)

<img src="../images/two_107/c_two_107.png">

```java

```

### d 

[https://leetcode.cn/problems/count-zero-request-servers/](https://leetcode.cn/problems/count-zero-request-servers/)

<img src="../images/two_107/d_two_107.png">

```java


```