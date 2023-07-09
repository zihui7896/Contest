### a

[https://leetcode.cn/problems/check-if-the-number-is-fascinating/](https://leetcode.cn/problems/check-if-the-number-is-fascinating/)

<img src="../images/two_106/20230704174511.png">

```java
class Solution {
    public boolean isFascinating(int n) {
        int[] st = new int[10];

        StringBuilder s = new StringBuilder();
        s.append(n + "" + n * 2 + "" + n * 3);
        for (int i = 0; i < s.length(); i ++)  {
            st[s.charAt(i) - '0'] ++;
        }
        for (int i = 1; i < 10; i ++) {
            if (st[i] != 1) return false;
        }
        return st[0] == 0;

    }
}
```

### b

[https://leetcode.cn/problems/find-the-longest-semi-repetitive-substring/](https://leetcode.cn/problems/find-the-longest-semi-repetitive-substring/)

<img src="../images/two_106/20230704174738.png">

```java
class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int l = 0, r = 1;
        int n = s.length();
        int cnt = 0, res = 1;
        
        for ( ; r < n; r ++) {
            if (s.charAt(r) == s.charAt(r - 1)) {
                cnt ++;
                if (cnt > 1) {
                    for (l ++; s.charAt(l) != s.charAt(l - 1); l ++) 
                    cnt = 1;
                }
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
```

```c++
class Solution {
public:
    int longestSemiRepetitiveSubstring(string s) {
        int ans = 1, cnt = 0;

        for (int i = 1, j = 0; i < s.size(); i++) {
            if (s[i] == s[i - 1])
                ++cnt;

            while (cnt > 1 && j < i) {
                if (s[j] == s[j + 1])
                    --cnt;

                ++j;
            }

            ans = max(ans, i - j + 1);
        }

        return ans;
    }
};

```

### c

[https://leetcode.cn/problems/movement-of-robots/](https://leetcode.cn/problems/movement-of-robots/)

<img src="../images/two_106/20230704175112.png">

```java

```

### d

[https://leetcode.cn/problems/find-a-good-subset-of-the-matrix/](https://leetcode.cn/problems/find-a-good-subset-of-the-matrix/)

<img src="../images/two_106/20230704175150.png">

```java

```


