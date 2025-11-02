
package pruebaInterfaz;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;




public class VentanaAMano extends JFrame{
    JPanel p = new JPanel();
    JLabel etiqueta = new JLabel();
    JButton botonUno = new JButton();
    JButton botonDos = new JButton();

    
    public VentanaAMano(){
        p.setLayout(null);
        p.add(this.etiqueta);
        p.add(this.botonUno);
        p.add(this.botonDos);
    
        this.etiqueta.setText("---");
        this.etiqueta.setBounds(80,40,120,80);       
        this.botonUno.setText("UNO");
        this.botonUno.setBounds(270, 20, 90, 30);
        this.botonDos.setText("DOS");
        this.botonDos.setBounds(270, 60, 90, 30);
        
        this.setSize(400,200);
        this.setContentPane(this.p);
        this.setTitle("Ventana de prueba");
        
        //Evento de la ventana
        this.addComponentListener(new ComponentAdapter(){
            @Override
            public void componentResized(ComponentEvent e) {
                etiqueta.setText("Se movio"); 
            }
             
        });
        
        
        //Logica de eventos
        botonUno.addActionListener(new claseEscuchaBotonUno());
        
        botonDos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                etiqueta.setText("Dos");
            }
        });

    }
    
    private class claseEscuchaBotonUno implements ActionListener{
        public void actionPerformed(ActionEvent e){
            etiqueta.setText("Uno");
        }
    
    }
     

    
}
