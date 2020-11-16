/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.dto;

import auto.recharge.system.enumClasses.UssdRequestType;

/**
 * @author monirozzamanroni
 */
public class MobileBankingDetailsDto {

    private String trxId;
    private String service;
    private String action;
    private String acNo;
    private String amount;
    private String selectableSimPort;
    private String selectableSim;
    private UssdRequestType status;


    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSelectableSimPort() {
        return selectableSimPort;
    }

    public void setSelectableSimPort(String selectableSimPort) {
        this.selectableSimPort = selectableSimPort;
    }

    public String getSelectableSim() {
        return selectableSim;
    }

    public void setSelectableSim(String selectableSim) {
        this.selectableSim = selectableSim;
    }

    public UssdRequestType getStatus() {
        return status;
    }

    public void setStatus(UssdRequestType status) {
        this.status = status;
    }

}
