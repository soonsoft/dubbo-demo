package soon.demo.dubbo.services;

import soon.demo.services.api.ICalculator;

import javax.annotation.Resource;
import java.math.BigDecimal;

public class DubboCalculator implements ICalculator {

    @Resource
    private ICalculator caculator;

    public BigDecimal add(BigDecimal num1, BigDecimal num2) {
        return caculator.add(num1, num2);
    }

    public BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        return caculator.subtract(num1, num2);
    }

    public BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        return caculator.multiply(num1, num2);
    }

    public BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        return caculator.divide(num1, num2);
    }
}
