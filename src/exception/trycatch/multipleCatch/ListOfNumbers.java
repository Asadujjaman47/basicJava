package exception.trycatch.multipleCatch;

public class ListOfNumbers {
    public int[] arr = new int[10];

    public void writeList() {

        try {
            arr[10] = 11;
        }

        catch (NumberFormatException e1) {
            System.out.println("Number Format Exception => " + e1.getMessage());
        }

        catch (IndexOutOfBoundsException e2) {
            System.out.println("Index Out of Bounds => " + e2.getMessage());
        }
    }
}
