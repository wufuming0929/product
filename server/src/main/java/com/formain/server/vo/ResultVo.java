package com.formain.server.vo;

import lombok.Data;

/**
 * 项目名称：product
 * 包： com.formain.product.vo
 * 类名称：ResultVo.java
 * 类描述：返回结果给前端的vo
 * 创建人：wufuming
 * 创建时间：2018年11月18日
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T data;
}