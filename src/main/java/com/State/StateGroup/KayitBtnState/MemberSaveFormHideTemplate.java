package com.State.StateGroup.KayitBtnState;

import com.Facade.FxmlSetTextFacade;
import com.Facade.SaveDeleteFactoryFacade;
import com.State.StateGroup.StateAbst.SaveFromState;
import com.Singleton.HBoxSingle;
import com.POJO.MemberPOJO;
import com.State.Handle.AbstractFormHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberSaveFormHideTemplate extends SaveFromState {
    @Autowired MemberSaveFormShow memberSaveFormShow;
    @Override
    public void Handle(AbstractFormHandle abstractFormHandle) {
        this.hide();
        abstractFormHandle.setKayitFormState(memberSaveFormShow);
        SaveDeleteFactoryFacade.getInstance().memberListAddNewMember();
        FxmlSetTextFacade.getInstance().setAddAllTextField(new MemberPOJO());
    }

    private void hide(){
        this.setVisibleHBox();
        this.minimizeMainWindow();
        HBoxSingle.getInstance().getTopHBox().setLayoutY(0);
        HBoxSingle.getInstance().getTopHBox().setMinWidth(220);
        HBoxSingle.getInstance().getTopHBox().setMinHeight(80);
    }
}
