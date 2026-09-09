public class StackClient {
    public static Stack flipped(Stack s) {
        Stack f = new Stack();
        int originalSize = s.size();

        for (int i = 0; i < originalSize; i++) {
            int num = s.pop();
            f.push(num);
        }
        return f;
    }
}
