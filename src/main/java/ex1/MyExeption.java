package ex1;

public class MyExeption extends RuntimeException {

    public MyExeption(String s) {
        System.out.println(s);
    }
}

