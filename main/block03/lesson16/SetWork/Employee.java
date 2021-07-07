package main.block03.lesson16.SetWork;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Employee {
    private String fio;
    private BigDecimal workAge;
}