package com.State.Handle;

import org.springframework.stereotype.Component;

@Component
public class UpdateBtnHandle extends AbstractFormHandle {
    @Override
    public void handle() {
        this.saveFormState.Handle(this);
    }
}
