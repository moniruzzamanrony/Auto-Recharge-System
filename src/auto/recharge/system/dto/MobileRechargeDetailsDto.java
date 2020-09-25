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
public class MobileRechargeDetailsDto {

    private String trxId;
    private String dateAndTime;
    private String phoneNumber;
    private String ammount;
    private String postPaidOrPostPaid;
    private String selectableSimPort;
    private String selectableSim;
    private UssdRequestType status;

    public MobileRechargeDetailsDto(String trxId, String dateAndTime, String phoneNumber, String ammount, String postPaidOrPostPaid, String selectableSimPort, String selectableSim, UssdRequestType status) {
        this.trxId = trxId;
        this.dateAndTime = dateAndTime;
        this.phoneNumber = phoneNumber;
        this.ammount = ammount;
        this.postPaidOrPostPaid = postPaidOrPostPaid;
        this.selectableSimPort = selectableSimPort;
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

    public String getSelectableSimPort() {
        return selectableSimPort;
    }

    public UssdRequestType getStatus() {
        return status;
    }

    public String getSelectableSim() {
        return selectableSim;
    }

    @Override
    public String toString() {
        return "MobileRechargeDetailsDto{" + "trxId=" + trxId + ", dateAndTime=" + dateAndTime + ", phoneNumber=" + phoneNumber + ", ammount=" + ammount + ", postPaidOrPostPaid=" + postPaidOrPostPaid + ", selectableSimPort=" + selectableSimPort + ", status=" + status + '}';
    }

}
