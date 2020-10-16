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
public class MobileRechargeDetailsForSearchingDto {

    private String trxId;
    private String dateAndTime;
    private String phoneNumber;
    private String cBalance;
    private String postPaidOrPostPaid;
    private String ammount;
    private String selectableSim;
    private String status;

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setcBalance(String cBalance) {
        this.cBalance = cBalance;
    }

    public void setPostPaidOrPostPaid(String postPaidOrPostPaid) {
        this.postPaidOrPostPaid = postPaidOrPostPaid;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public void setSelectableSim(String selectableSim) {
        this.selectableSim = selectableSim;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrxId() {
        return trxId;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getcBalance() {
        return cBalance;
    }

    public String getPostPaidOrPostPaid() {
        return postPaidOrPostPaid;
    }

    public String getAmmount() {
        return ammount;
    }

    public String getSelectableSim() {
        return selectableSim;
    }

    public String getStatus() {
        return status;
    }
}
