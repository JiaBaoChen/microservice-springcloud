package com.jobs.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class SaleOrder {

    private static final long serialVersionUID = -4749861296488979743L;

    private BigDecimal amount;//总金额

    private boolean deleted; //删除状态

}
