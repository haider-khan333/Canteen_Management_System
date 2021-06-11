package com.example.sqlitecrud;

public class model
{
  String orderStatus;
    String updateStatus;
    String deliveryInfo;
    String deliveryLocation;
    String visitChat;
    String cancelOrder;
    String dashBoard;

    public model(String orderStatus, String updateStatus, String deliveryInfo, String deliveryLocation, String visitChat, String cancelOrder, String dashBoard) {
        this.orderStatus = orderStatus;
        this.updateStatus = updateStatus;
        this.deliveryInfo = deliveryInfo;
        this.deliveryLocation = deliveryLocation;
        this.visitChat = visitChat;
        this.cancelOrder = cancelOrder;
        this.dashBoard = dashBoard;
    }



    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    public String getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getVisitChat() {
        return visitChat;
    }

    public void setVisitChat(String visitChat) {
        this.visitChat = visitChat;
    }

    public String getCancelOrder() {
        return cancelOrder;
    }

    public void setCancelOrder(String cancelOrder) {
        this.cancelOrder = cancelOrder;
    }

    public String getDashBoard() {
        return dashBoard;
    }

    public void setDashBoard(String dashBoard) {
        this.dashBoard = dashBoard;
    }


}
