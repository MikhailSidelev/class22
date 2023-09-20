package class22;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble[] arr = {new Car(), new Dog()};
        for (MoveAble a : arr) {
            a.move();
            WashAble[] arr1 = {new Car(), new Dog()};
            for (WashAble b : arr1) {
                b.wash();

            }
        }

    }
}