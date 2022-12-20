package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        int[] array = utils.createArray();
        int cellsPowSum = utils.sumPow(array);
        System.out.println("Suma kwadratów wprowadzonych liczb to " + cellsPowSum);
    }
}