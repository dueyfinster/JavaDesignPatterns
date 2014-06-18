package structural.facade;

public class CPU {

    public void freeze() {
        System.out.println("Processor freezed");
    }
    public void jump(long position) {
        System.out.println("Processor jumped to position " + position);
    }
    public void execute() {
        System.out.println("Processor executed");
    }
}
