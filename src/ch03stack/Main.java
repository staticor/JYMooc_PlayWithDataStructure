package ch03stack;

public class Main {

    public static void main(String[] args) {
        MyArrayStack<String> haha = new MyArrayStack<>();

        for(int i = 0; i < 5; i ++){
            haha.push(i + "");
            System.out.println(haha);
        }

        haha.pop();
        System.out.println(haha);

    }
}
