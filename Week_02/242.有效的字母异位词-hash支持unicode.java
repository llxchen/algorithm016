import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 *
 * https://leetcode-cn.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (61.41%)
 * Likes:    253
 * Dislikes: 0
 * Total Accepted:    139.2K
 * Total Submissions: 226.5K
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 
 * 示例 1:
 * 
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * 
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * 
 */

// @lc code=start
// 1.　排序
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length())
//             return false;
//         var sa = s.toCharArray();
//         var ta = t.toCharArray();
//         Arrays.sort(sa);
//         Arrays.sort(ta);
//         return Arrays.equals(sa, ta);
//     }
// }

//2.　hash表
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length())
//             return false;

//         var ht = new int[26];
//         for (var i = 0; i < s.length(); i++) {
//             ht[s.charAt(i) - 'a']++;
//         }
//         for (var i = 0; i < t.length(); i++) {
//             ht[t.charAt(i) - 'a']--;
//             if (ht[t.charAt(i) - 'a'] < 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// 3. 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// hash表, test case: s="中华人民共和国", t="国和共人民华中"
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        var ht = new HashMap<Character, Integer>();
        for (var i = 0; i < s.length(); i++) {
            var key = s.charAt(i);
            ht.put(key, ht.getOrDefault(key, 0) + 1);
        }
        for (var i = 0; i < t.length(); i++) {
            var key = t.charAt(i);
            int v = ht.getOrDefault(key, 0) - 1;
            if (v < 0)
                return false;
            ht.put(key, v);
        }
        return true;
    }
}

// @lc code=end
