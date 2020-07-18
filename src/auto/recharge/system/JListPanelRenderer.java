/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto.recharge.system;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

class JListPanelRenderer implements ListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         JPanel renderer = (JPanel) value;
//        Set<MobileBankingBalanceShowDto> bankingBalanceShowDtos = new HashSet<>();
//        List<String> ussdCodeSerialList = new ArrayList<>();
//        DefaultListModel Clistmodel = new DefaultListModel();//
//
//        DbConnection.connect();
//        ResultSet rs = DbConnection.retrieveAll("mobile_banking");
//        try {
//            while (rs.next()) {
//                MobileBankingBalanceShowDto mobileBankingBalanceShowDto = new MobileBankingBalanceShowDto();
//                mobileBankingBalanceShowDto.setServiceId(rs.getString("serviceId"));
//                mobileBankingBalanceShowDto.setServiceName(rs.getString("services_name"));
//                mobileBankingBalanceShowDto.setDefaultSIM(rs.getString("default_sim"));
//                mobileBankingBalanceShowDto.setUssdCode(rs.getString("ussd_code").replaceAll("pin", rs.getString("pin")));
//                mobileBankingBalanceShowDto.setPin(rs.getString("pin"));
//                bankingBalanceShowDtos.add(mobileBankingBalanceShowDto);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(JListPanelRenderer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        DbConnection.disconnect();
//        
////       Pattern p = Pattern.compile("\\d+");
////        Matcher m = p.matcher(ussdReplace);
////        ussdCodeSerialList.clear();
////        while (m.find()) {
////
////            ussdCodeSerialList.add(m.group());
////        }
//        if (cellHasFocus) {
//            
//            MobileBankingBalanceShowCard mobileBankingBalanceShowCard = (MobileBankingBalanceShowCard) list.getSelectedValue();
//
//            for(MobileBankingBalanceShowDto mobileBankingBalanceShowDto: bankingBalanceShowDtos){
//                if(mobileBankingBalanceShowDto.getServiceName().contains(mobileBankingBalanceShowCard.getServiceNameText().getText()))
//            System.err.println(mobileBankingBalanceShowDto.getUssdCode());
//            }
//        }
//        
       


        return renderer;
    }

}
