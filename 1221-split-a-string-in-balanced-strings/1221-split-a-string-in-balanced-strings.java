class Solution {
    public int balancedStringSplit(String s) {
    int cnt = 0;
    int tot = 0;

    int len = s.length();

    for (int i = 0; i < len; i++) {
      var l = s.charAt(i);

      if ('R' == l)
        ++cnt;
      else
        --cnt;

      if (cnt == 0)
        ++tot;
    }

    return tot;
  }
}