public class BuscaBidirecional {

    static void main() {
        int[] nums = new int[] {231, 241, 5, 2, 5, 7};
        int target = 6;
        int esq = 0;
        int dir = nums.length - 1;

        boolean founded = false;
        while (esq <= dir) {
            if (nums[esq] == target || nums[dir] == target) {
                founded = true;
                break;
            }
            esq++;
            dir--;
        }

        System.out.println(founded);
    }
}
