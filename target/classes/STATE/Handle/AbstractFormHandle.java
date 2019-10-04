package com.State.Handle;

import com.State.StateGroup.StateAbst.FormState;

public abstract class AbstractFormHandle {

    protected FormState saveFormState;

    private FormState getKayitFormState() {
        return saveFormState;
    }

    public void setKayitFormState(FormState saveFormState) {
        this.saveFormState = saveFormState;
    }

    abstract public void handle();
}
