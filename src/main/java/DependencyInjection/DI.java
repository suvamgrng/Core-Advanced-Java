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
        // Create service dependency
        Service service = new Service();

        // Create injection
        DI di = new DI(service);
        di.service.doSomething();

    }
}
