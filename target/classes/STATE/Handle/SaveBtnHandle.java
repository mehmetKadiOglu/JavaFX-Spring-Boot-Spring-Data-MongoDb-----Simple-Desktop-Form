package com.State.Handle;

import org.springframework.stereotype.Component;

@Component
public class SaveBtnHandle extends AbstractFormHandle {

    @Override
    public void handle(){
        this.saveFormState.Handle(this);
    }

}
