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
public class Products {

    private String bar_code;
    private String p_name;
    private String warranty;
    private String price;
    private String qty;
    private String sub_total;

    public String getBarCode() {
        return bar_code;
    }

    public void setBarCode(String barCode) {
        this.bar_code = barCode;
    }

    public String getpName() {
        return p_name;
    }

    public void setpName(String pName) {
        this.p_name = pName;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSubTotal() {
        return sub_total;
    }

    public void setSubTotal(String subTotal) {
        this.sub_total = subTotal;
    }
    

}
