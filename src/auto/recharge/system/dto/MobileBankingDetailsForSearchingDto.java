/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.dto;

import auto.recharge.system.enumClasses.UssdRequestType;

/**
 *
 * @author monirozzamanroni
 */
public class MobileBankingDetailsForSearchingDto {
    private String trxId;
    private String serviceName;
    private String actionType;
    private String phoneNo;


    private String amount;
    private String cBalance;
    private String result;
    private String dateAndType;
    private String info;
    private String sim;
    private String status;

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getcBalance() {
        return cBalance;
    }

    public void setcBalance(String cBalance) {
        this.cBalance = cBalance;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDateAndType() {
        return dateAndType;
    }

    public void setDateAndType(String dateAndType) {
        this.dateAndType = dateAndType;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
        public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
