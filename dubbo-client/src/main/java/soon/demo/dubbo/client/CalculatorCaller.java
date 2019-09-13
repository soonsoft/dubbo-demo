package soom.demo.dubbo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import soon.demo.services.api.ICalculator;

import java.math.BigDecimal;

public class CalculatorCaller {

    public static void main(String[] args) {

        String[] configArr = new String[] {
                "classpath*:/spring/*.xml"
        };

        ClassPathXmlApplicationContext context = null;

        try {
            context = new ClassPathXmlApplicationContext(configArr, false);
            context.refresh();

            ICalculator calculator = (ICalculator) context.getBean("calculator");
            System.out.println(calculator.add(BigDecimal.ONE, BigDecimal.ONE));
        } catch (Exception e) {

        } finally {
            if(context != null) {
                context.close();
            }
        }
    }

}
