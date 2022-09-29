//bizim çalışan

public class worker implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println(" worker calısabilir");

    }

    @Override
    public void eat() {
        System.out.println("worker yiyebilir");

    }

    @Override
    public void pay() {
        System.out.println("worker maas odenir");

    }
}
