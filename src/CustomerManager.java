public class CustomerManager {
    private IWorkable workable;
    private IEatable eatable;
    private IPayable payable;

    public CustomerManager(IWorkable workable,IEatable eatable,IPayable payable){
        this.workable=workable;
        this.eatable=eatable;
        this.payable=payable;

    }
    public void work(){
        workable.work();
    }
    public void eat(){
        eatable.eat();
    }
    public void pay(){
        payable.pay();
    }
}
