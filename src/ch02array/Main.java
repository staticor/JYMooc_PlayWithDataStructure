package ch02array;



public class Main {

    public static void main(String[] args) {

        MyArray<Integer> arr = new MyArray<>(5);

        System.out.println(arr);

        for(int i = 0 ; i < 10; i++){
            arr.addLast(i);
            System.out.println(arr);

        }

        arr.add(1, 100);

        System.out.println(arr);
    }
}
