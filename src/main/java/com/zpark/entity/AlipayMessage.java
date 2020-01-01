package com.zpark.entity;

import lombok.Data;

/**
 * @ClassName AlipayMessage
 * @Description TODO
 * @Author
 * @Date 2019/12/21 18:03
 * @Version 1.0
 */
@Data
public class AlipayMessage {
    private Long out_trade_no;
    private String product_code;
    private Double total_amount;
    private String subject;
    private String body;
    private String passback_params;
    private ExtendParams extend_params;
}
