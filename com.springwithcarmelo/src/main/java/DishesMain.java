import org.springframework.context.support.ClassPathXmlApplicationContext;

import cookers.Cookers;

public class DishesMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                        "order.xml");
        Cookers cooker = context.getBean(Cookers.class);
        cooker.receiveOrder();
        cooker.deliverOrder();

        context.close();
    }
}
