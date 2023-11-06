class cir {
    static int arr[];
    int size;
    int front = 0;
    int rear = -1;

    public cir(int size) {
        this.size = size;
        arr = new int[size];
    }

    void add(int element) {
        rear++;
        rear = rear % size;
        arr[rear] = element;
        System.out.println("added" + element);
    }

    void remove() {
        if (rear == -1) {
            System.out.println("no elements to remove");
        } else {
            System.out.println("removed" + arr[front]);
            front++;
        }
    }
}

public class circular {
    public static void main(String[] args) {
        cir c = new cir(5);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);

        c.remove();
        c.remove();

        c.add(8);
        c.add(9);
        c.add(10);
        for (int i = 0; i < c.size; i++) {
            System.out.println(c.arr[i]);
        }
    }
}
