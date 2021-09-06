package Lesso2ExceptionHomeWork;

public class ArrDataException extends Exception {
    public int i;
    public int j;

    ArrDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}