class qimp {
    static int arr[];
    static int size;
    static int end;

    qimp(int size) {
        this.size = size;
        end = -1;
        arr = new int[size];
    }

    void add(int element) {
        if (end < arr.length - 1) {
            end++;
            arr[end] = element;
        } else {
            System.out.println("queue full");
        }
    }

    void remove() {
        int front = 0;
        if (end == -1) {
            System.out.println("no elements in queue");
        } else {
            int removed = arr[front];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            end--;
            System.out.println("removed element from queue " + removed);
        }
    }

    int peek() {
        System.out.println(arr[0]);
        return arr[0];
    }
}

public class queue {
    public static void main(String[] args) {
        qimp q1 = new qimp(5);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);

        q1.remove();
        q1.remove();
        q1.remove();
        q1.remove();

        q1.peek();
    }
}
