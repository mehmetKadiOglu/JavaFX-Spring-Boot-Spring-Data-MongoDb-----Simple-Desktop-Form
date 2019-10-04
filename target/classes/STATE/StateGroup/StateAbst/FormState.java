package com.State.StateGroup.StateAbst;

import com.State.Handle.AbstractFormHandle;
import com.Main.Main;

public abstract class FormState {
   abstract public void Handle(AbstractFormHandle abstractFormHandle);

   protected void minimizeMainWindow(){
      Main.scene.getWindow().setHeight(220);
      Main.scene.getWindow().setWidth(240);
   }
}
