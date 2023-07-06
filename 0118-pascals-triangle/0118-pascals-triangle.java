import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevList = null; // temp for prev row

        // for each row
        for (int r = 1; r <= n; r++) {
            List<Integer> list = new ArrayList<>();

            // for each col
            for (int c = 1; c <= r; c++) {
                // first and last item, print 1
                if (c == 1 || c == r) {
                    list.add(1);
                } else {
                    // for the middle items, we get from the prev row
                    list.add(prevList.get(c - 2) + prevList.get(c - 1));
                }
            }

            result.add(list);
            prevList = list;
        }


        return result;
    }
}