import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean_cat = (Cat) applicationContext.getBean("cat");
        HelloWorld bean_hw =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean_cat_2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean_hw));
        System.out.println(bean_cat.equals(bean_cat_2));
    }
}