package clases;
import menuxdd.Ventana;
import javax.swing.JLabel;

import AppPackage.AnimationClass;

public class animacion_up {
    public JLabel lable;

    public void anim_up_up(){
        AnimationClass lista = new AnimationClass();
        lista.jLabelYUp(10, -20, 10, 5, lable);
    }; 
    public void anim_down_up(){
        AnimationClass menu_principal = new AnimationClass();
        menu_principal.jLabelYDown(-20, 10, 5, 10, lable);
    };
}
