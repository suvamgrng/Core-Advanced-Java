package DependencyInjection;

public class DI {

    // Dependency field
    private  Service service;

    public DI(Service service) {
        this.service = service;
        System.out.println(service);
    }

    public  void setService(Service service) {
        this.service = service;
    }

    public static void main(String[] args) {
        Service di = new DI();
        System.out.println(di.getClass());
    }
}
