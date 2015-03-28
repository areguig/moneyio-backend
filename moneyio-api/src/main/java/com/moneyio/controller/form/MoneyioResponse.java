package com.moneyio.controller.form;

import java.util.List;

/**
 * Created by akli on 28/03/15.
 */
public class MoneyioResponse {
    /**
     * The status of the response : success or error
     */
    public String status;
    /**
     * this property is filled when the status of the response is
     * error to indicate the code of the error.
     */
    public String code;

    /**
     * contains the raw body of the response if it needs one.
     */
    public List<MoneyioForm> data;

    /**
     * a message useful when a status is an error.
     */
    public String message;
}
