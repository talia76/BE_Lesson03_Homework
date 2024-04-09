import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Application app = (Application) context.getBean("applicationBean");

        app.setId(1);
        app.setName("MyApplication");

        System.out.println("ID: " + app.getId());
        System.out.println("Name: " + app.getName());
    }
}
