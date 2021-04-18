public class max_array {
    public static int max(int[] m) {
        int max_val = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i]>max_val) {
                max_val = m[i];
            }            
        }
        return max_val;        
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
    }
}
