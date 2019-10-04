package com.State.StateGroup.StateAbst;

import com.Singleton.HBoxSingle;
import com.Singleton.HBoxVisible;

public abstract class SaveFromState extends FormState{

    protected void setVisibleHBox(){
        HBoxSingle.getInstance().getBottomHBox().setVisible(HBoxVisible.getInstance().isVİSİBLE());
        HBoxSingle.getInstance().getSaveForm().setVisible(!HBoxVisible.getInstance().isVİSİBLE());
        HBoxVisible.getInstance().setVİSİBLE();
    }
    protected void minimizeMainWindow(){
        super.minimizeMainWindow();
    }

}
