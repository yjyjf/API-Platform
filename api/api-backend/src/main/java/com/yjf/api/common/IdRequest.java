package com.yjf.api.common;

import lombok.Data;

import java.io.Serializable;


/**
 * 接收接口的id
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}