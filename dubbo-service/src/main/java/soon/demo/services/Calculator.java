package soon.demo.services;

import soon.demo.services.api.ICalculator;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by zWX458959 on 2017/9/27.
 */
@Service("caculator")
public class Calculator implements ICalculator {

    public BigDecimal add(BigDecimal num1, BigDecimal num2) {
        if(num1 == null) {
            num1 = BigDecimal.ZERO;
        }
        if(num2 == null) {
            num2 = BigDecimal.ZERO;
        }

        return num1.add(num2);
    }

    public BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        if(num1 == null) {
            num1 = BigDecimal.ZERO;
        }
        if(num2 == null) {
            num2 = BigDecimal.ZERO;
        }

        return num1.subtract(num2);
    }

    public BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        if(num1 == null) {
            num1 = BigDecimal.ZERO;
        }
        if(num2 == null) {
            num2 = BigDecimal.ONE;
        }
        return num1.multiply(num2);
    }

    public BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        if(num1 == null) {
            num1 = BigDecimal.ZERO;
        }
        if(num2 == null) {
            num2 = BigDecimal.ONE;
        }
        return num1.divide(num2);
    }
}
