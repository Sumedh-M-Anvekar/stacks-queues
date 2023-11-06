
public class stackimp {
    static class Stack {
        int size;
        int arr[];
        int top;

        public Stack(int size) {
            top = -1;
            this.size = size;
            arr = new int[size];
        }

        void push(int element) {
            if (top <= arr.length - 1) {
                System.out.print("Insertion");
                top++;
                arr[top] = element;
                System.out.println(arr[top]);
            } else {
                System.out.println("stack underflow");
            }
        }

        void pop() {
            if (top == -1) {
                System.out.println("stack underflow");
            } else {
                top--;
            }
        }

        int peek() {
            System.out.println(arr[top]);
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        // s.push(5);

        // s.push(6);
        s.push(5);
        s.push(1);
        s.push(8);
        s.push(88);
        s.pop();
        s.peek();

        // System.out.println(s.top);
    }
}