public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager(new OutsourceWorker(),new worker(),new worker());
        customerManager.work();
        customerManager.eat();
        customerManager.pay();

    }
}