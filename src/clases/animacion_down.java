package clases;
import AppPackage.AnimationClass;
import menuxdd.Ventana;
import javax.swing.JLabel;


public class animacion_down {
    public JLabel label_down;
    
    public void anim_up_down(){
        AnimationClass lista = new AnimationClass();
        lista.jLabelYUp(270, 250, 10, 5, label_down);
    };
    public void anim_down_down(){
        AnimationClass menu_principal = new AnimationClass();
        menu_principal.jLabelYDown(250, 270, 10, 5, label_down);
    };
}
