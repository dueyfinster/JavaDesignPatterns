package structural.facade;

class ComputerFacade {
    private static final long BLOCK = 10l;
    private static final int SIZE = 10;
    private CPU processor;
    private Memory ram;
    private HDD hd;
 
    ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HDD();
    }
 
    public void start() {
        processor.freeze();
        ram.load(pos, hd.read(POSITION, SIZE));
        processor.jump(pos);
        processor.execute();
    }
}
