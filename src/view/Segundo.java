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
public class Segundo implements Runnable{

    @Override
    public void run() {
        int i = Integer.parseInt(TelaRandom.txtSegundos.getText());
        for(;;){
            TelaRandom.txtSegundos.setText(i+"");
            i++;
            if(1==59){
                i=0;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Milesimos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
     
        
    }
    
}
