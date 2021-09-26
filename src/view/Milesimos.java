/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Igor
 */
public class Milesimos implements Runnable{

    @Override
    public void run() {
        int i = Integer.parseInt(TelaRandom.txtMilesimos.getText());
        for(;;){
            TelaRandom.txtMilesimos.setText(i+"");
            i++;
            if(1==1000){
                i=0;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Milesimos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
    
    
    
    
    
}
