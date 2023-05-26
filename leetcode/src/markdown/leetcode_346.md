### leetcode2696 
给你一个仅由 大写 英文字符组成的字符串 s 。
你可以对此字符串执行一些操作，在每一步操作中，你可以从 s 中删除 任一个 "AB" 或 "CD" 子字符串。
通过执行操作，删除所有 "AB" 和 "CD" 子串，返回可获得的最终字符串的 最小 可能长度。
注意，删除子串后，重新连接出的字符串可能会产生新的 "AB" 或 "CD" 子串。
[https://leetcode.cn/problems/minimum-string-length-after-removing-substrings/description/](https://leetcode.cn/problems/minimum-string-length-after-removing-substrings/description/)


```java
class Solution {
    public int minLength(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            
            if (!st.isEmpty() && ((st.peek() == 'A' && c == 'B') || (st.peek() == 'C' && c == 'D'))) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        return st.size();
    }
}
```

给你一个由 小写英文字母 组成的字符串 s ，你可以对其执行一些操作。在一步操作中，你可以用其他小写英文字母 替换  s 中的一个字符。
请你执行 尽可能少的操作 ，使 s 变成一个 回文串 。如果执行 最少 操作次数的方案不止一种，则只需选取 字典序最小 的方案。
对于两个长度相同的字符串 a 和 b ，在 a 和 b 出现不同的第一个位置，如果该位置上 a 中对应字母比 b 中对应字母在字母表中出现顺序更早，则认为 a 的字典序比 b 的字典序要小。
返回最终的回文字符串。

https://leetcode.cn/problems/lexicographically-smallest-palindrome/

```java
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] res = s.toCharArray();

        int n = s.length();
        int cnt = 0;
        for (int i = 0, j = n - 1; i < j; i ++, j --) {
            if (res[i] == res[j]) continue;
            if (res[i] > res[j]) {
                res[i] = res[j];
            } else {
                res[j] = res[i];
            }
            cnt ++;
        }
        return new String(res);
    }
}
```