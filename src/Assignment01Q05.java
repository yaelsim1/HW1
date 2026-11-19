public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        
        if (i == j) {
            return 0;
        }

        int size = m.length;

        int[] dist = new int[size];
        for (int k = 0; k < size; k++) {
            dist[k] = -1;
        }

        int[] queue = new int[size];
        int start = 0;
        int end = 0;

        dist[i] = 0;
        queue[end] = i;
        end++;

        while (start < end) {
            int current = queue[start];
            start++;

            for (int neighbor = 0; neighbor < size; neighbor++) {
                if (m[current][neighbor] == 1 && dist[neighbor] == -1) {
                    dist[neighbor] = dist[current] + 1;

                    if (neighbor == j) {
                        return dist[neighbor];
                    }

                    queue[end] = neighbor;
                    end++;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}