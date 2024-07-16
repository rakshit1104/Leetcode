class Solution {

    public static int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (s.peek() != -1 && arr[s.peek()] >= curr) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }

    public static int[] prevSmallerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            while (s.peek() != -1 && arr[s.peek()] >= curr) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
    
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] next = new int[n];
        int[] prev = new int[n];

        next = nextSmallerElement(heights, n);
        prev = prevSmallerElement(heights, n);

        int area = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int length = heights[i];

            if (next[i] == -1) next[i] = n;
            int breadth = next[i] - prev[i] - 1;
            int currArea = length * breadth;
            area = Math.max(area, currArea);
        }
        return area;
    }
}