public class ArrayTest {
    public static void main(String[] args) {
        int[] x = new int[5];
        //x[0] = "1";
        x[1] = 5;
        System.out.println(x[0]);
        System.out.println(x[1]);

        String[] y = new String[]{"qqwe", "123"};
        System.out.println(y[0]);

        String[] m = {"12", "asd"};
        System.out.println(m[0]);
    }
}
/**
// 基本类型数组 - 自动初始化
int[] numbers = new int[2];
// numbers = [0, 0]  ← 自动初始化为0
numbers[0] = 100;  // ✅ 可以，因为numbers[0]已经是0

// 引用类型(对象)数组 - 不会自动创建对象
Dog[] dogs = new Dog[2];
// dogs = [null, null] ← 自动初始化为null
dogs[0].weight = 100;  // ❌ 不行，因为dogs[0]是null

dog[0] = new Dog();

 */