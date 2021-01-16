public class Main {


    //旋转数组
//    public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//        k %= n;
//        while(k != 0){
//            int ret = nums[n - 1];
//            for(int i = n - 1; i > 0; i--){
//                nums[i] = nums[i - 1];
//            }
//            nums[0] = ret;
//            k--;
//        }
//    }

//    //字符串转小写
//    public static String toLowerCase(String str) {
//        char[] ch = str.toCharArray();
//        for(int i = 0; i < str.length(); i++){
//            if(ch[i] >= 'A' && ch[i] <= 'Z'){
//                ch[i] += 32;
//            }
//        }
//        str = String.valueOf(ch);
//        return str;
//    }、

//    //原地移除所有的val值
//    public static int removeElement(int[] nums, int val) {
//        int n = nums.length;
//        int j = 0;
//        for(int i = 0; i < n; i++){
//            if(nums[i] != val){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }

    //搜索插入位置
//    public static int searchInsert(int[] nums, int target) {
//        int n = nums.length;
//        if(target < nums[0]) return 0;//头
//        if(target > nums[n - 1]) return n;//尾
//        int i = 0;
//        for(i = 0; i < nums.length; i++){
//            if(nums[i] == target){
//                break;
//            }else if(target > nums[i] && target < nums[i + 1]){
//                return i + 1;
//            }
//        }
//        return i;
//    }

    //判断回文
//    public static boolean isPalindrome(int x) {
//        if(x < 0) return false;
//        if(x < 10) return true;
//        String s = String.valueOf(x);
//        char[] c = s.toCharArray();
//        int len  = c.length;
//        boolean flag = false;
//        for(int i = 0; i < len / 2; i++){
//            if(c[i] != c[len - 1 - i]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static boolean isPalindrome(int x) {
//        if(x < 0) return false;
//        if(x < 10) return true;
//        int ret = x;
//        int y = 0,m = 0;
//        while(x!= 0){
//            m = x % 10;
//            y = y * 10 + m;
//            x /= 10;
//        }
//        return y == ret;
//    }

    //删除节点
//    public void deleteNode(ListNode node) {
//        if(node.next == null){
//            node = null;
//            return;
//        }
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }

    public static void main(String[] args) {

//        int x = 123123;
//        boolean f = isPalindrome(x);
//        System.out.println(f);

//        int[] nums = {1,3,5,6};
//        int target = 5;
//        int ret = searchInsert(nums,target);

//        int[] nums = {0,1,2,2,3,0,4,2};
//        int val = 2;
//        int ret = removeElement(nums,val);
//        System.out.println(ret);
//        rotate(nums,k);

//        String str = "HeLLo";
//        String s = toLowerCase(str);
//        System.out.println(s);

    }

}
