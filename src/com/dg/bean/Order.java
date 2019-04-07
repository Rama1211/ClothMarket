package com.dg.bean;

import com.dg.utils.OrderStatusType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vince on 2017/7/11.
 */
public class Order implements Serializable{
    private static final long  serialVersionUID = 1L;
    private int orderId;//订单id
    private List<OrderItem> orderItemList = new ArrayList<>();
    private String createDate;//订单生成时间
    private float sum;//总金额
    private OrderStatusType status = OrderStatusType.UNPAID;//订单状态类型，例如：已付款，未付款等
    private int userId;

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }


}
