package com.State.StateGroup.StateAbst;

import com.Singleton.HBoxSingle;
import com.Singleton.HBoxVisible;

public abstract class DeleteFormState extends FormState {


    protected void setVisibleHBox(){
        HBoxSingle.getInstance().getTopHBox().setVisible(HBoxVisible.getInstance().isVİSİBLE());
        HBoxSingle.getInstance().getBottomHBoxUpdate().setVisible(HBoxVisible.getInstance().isVİSİBLE());
        HBoxSingle.getInstance().getDeleteForm().setVisible(!HBoxVisible.getInstance().isVİSİBLE());
        HBoxVisible.getInstance().setVİSİBLE();
    }
    protected void minimizeMainWindow(){
        super.minimizeMainWindow();
    }

}
