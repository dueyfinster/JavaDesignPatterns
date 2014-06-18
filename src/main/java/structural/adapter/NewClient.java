package structural.adapter;

final class NewClient {

    private NewClient(){}

    /**
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("The date is: " + getDate());

    }
    
    public static String getDate(){
        return AdapterRunner.getDate();
    }

}
