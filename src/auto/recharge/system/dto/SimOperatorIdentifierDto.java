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
public class SimOperatorIdentifierDto {

    private int id;
    private String operatorName;
    private String portName;

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SimOperatorIdentifierDto{" + "operatorName=" + operatorName + ", portName=" + portName + '}';
    }

}
