
package pruebaInterfaz;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;



public class VentanaAMano extends JFrame{
    JLabel etiqueta = new JLabel();
    
    JButton botonUno = new JButton();
    
    JButton botonDos = new JButton();
    
    JPanel p = new JPanel();
    
    public VentanaAMano(){
        this.etiqueta.setText("---");
        this.etiqueta.setBounds(80,40,120,80);
        
        this.botonUno.setText("UNO");
        this.botonUno.setBounds(270, 20, 90, 30);

        this.botonDos.setText("DOS");
        this.botonDos.setBounds(270, 60, 90, 30);
        
        p.setLayout(null);
        p.add(this.etiqueta);
        p.add(this.botonUno);
        p.add(this.botonDos);
        
    }
    
    

    
}
