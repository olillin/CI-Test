import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class Main {
    public static int add1(int number) {
        return number + 1;
    }

    public void notTested() throws NotImplementedException {
        throw new NotImplementedException("Uh oh!");
    }
}
