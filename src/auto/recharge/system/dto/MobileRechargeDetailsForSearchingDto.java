/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.dto;

/**
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

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getcBalance() {
        return cBalance;
    }

    public void setcBalance(String cBalance) {
        this.cBalance = cBalance;
    }

    public String getPostPaidOrPostPaid() {
        return postPaidOrPostPaid;
    }

    public void setPostPaidOrPostPaid(String postPaidOrPostPaid) {
        this.postPaidOrPostPaid = postPaidOrPostPaid;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public String getSelectableSim() {
        return selectableSim;
    }

    public void setSelectableSim(String selectableSim) {
        this.selectableSim = selectableSim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
