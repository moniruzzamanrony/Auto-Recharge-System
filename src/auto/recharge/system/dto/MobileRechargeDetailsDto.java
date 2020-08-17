/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.dto;

/**
 *
 * @author monirozzamanroni
 */
public class MobileRechargeDetailsDto {
    
    private String trxId;
    private String dateAndTime;
    private String phoneNumber;
    private String ammount;
    private String postPaidOrPostPaid;
    private String selectableSim;
    private String status;

    public MobileRechargeDetailsDto(String trxId, String dateAndTime, String phoneNumber, String ammount, String postPaidOrPostPaid, String selectableSim, String status) {
        this.trxId = trxId;
        this.dateAndTime = dateAndTime;
        this.phoneNumber = phoneNumber;
        this.ammount = ammount;
        this.postPaidOrPostPaid = postPaidOrPostPaid;
        this.selectableSim = selectableSim;
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

    public String getAmmount() {
        return ammount;
    }

    public String getPostPaidOrPostPaid() {
        return postPaidOrPostPaid;
    }

    public String getSelectableSim() {
        return selectableSim;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "MobileRechargeDetailsDto{" + "trxId=" + trxId + ", dateAndTime=" + dateAndTime + ", phoneNumber=" + phoneNumber + ", ammount=" + ammount + ", postPaidOrPostPaid=" + postPaidOrPostPaid + ", selectableSim=" + selectableSim + ", status=" + status + '}';
    }


    
}
