/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system.config;

import auto.recharge.system.dto.MobileRechargeDetailsDto;
import java.util.Comparator;

/**
 *
 * @author monirozzamanroni
 */
public class MobileRechargeDetailsComparator implements Comparator<MobileRechargeDetailsDto>{

    @Override
    public int compare(MobileRechargeDetailsDto t, MobileRechargeDetailsDto t1) {
       if (t.getPhoneNumber().length() < t1.getPhoneNumber().length()) {
            return -1;
        }
        if (t.getPhoneNumber().length() > t1.getPhoneNumber().length()) {
            return 1;
        }
        return 0;
    }
    
}
