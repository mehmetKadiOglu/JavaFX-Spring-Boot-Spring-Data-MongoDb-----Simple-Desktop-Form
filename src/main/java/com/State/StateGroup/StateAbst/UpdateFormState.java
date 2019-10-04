package com.State.StateGroup.StateAbst;

import com.Singleton.HBoxSingle;
import com.Singleton.HBoxVisible;

public abstract class UpdateFormState extends FormState {
    protected void setVisibleHBox(){
        HBoxSingle.getInstance().getTopHBox().setVisible(HBoxVisible.getInstance().isVİSİBLE());
        HBoxSingle.getInstance().getBottomHBoxDelete().setVisible(HBoxVisible.getInstance().isVİSİBLE());
        HBoxSingle.getInstance().getUpdateForm().setVisible(!HBoxVisible.getInstance().isVİSİBLE());
        HBoxVisible.getInstance().setVİSİBLE();
    }

    protected void minimizeMainWindow(){
        super.minimizeMainWindow();
    }

}
