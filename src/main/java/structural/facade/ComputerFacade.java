package structural.facade;

class ComputerFacade {
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
        long pos = 10l;
        ram.load(pos, hd.read(pos, 10));
        processor.jump(pos);
        processor.execute();
    }
}
