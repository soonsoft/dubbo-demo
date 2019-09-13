package soon.demo.services.api;

import java.math.BigDecimal;

public interface ICalculator {

    BigDecimal add(BigDecimal num1, BigDecimal num2);

    BigDecimal subtract(BigDecimal num1, BigDecimal num2);

    BigDecimal multiply(BigDecimal num1, BigDecimal num2);

    BigDecimal divide(BigDecimal num1, BigDecimal num2);

}
