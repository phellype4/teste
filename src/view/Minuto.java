/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Igor
 */
public class Minuto implements Runnable{

    @Override
    public void run() {
        int i = Integer.parseInt(TelaRandom.txtMinutos.getText());
        for(;;){
            TelaRandom.txtMinutos.setText(i+"");
            i++;
            if(1==59){
                i=0;
            }
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Milesimos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
      
    }
    
}
