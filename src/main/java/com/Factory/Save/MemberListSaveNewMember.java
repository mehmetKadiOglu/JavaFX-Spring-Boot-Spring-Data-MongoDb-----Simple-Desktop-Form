package com.Factory.Save;

import com.Singleton.ListViewSingle;
import com.Singleton.MemberListSingle;
import com.POJO.MemberPOJO;
import com.Singleton.TextFieldSingle;
import org.springframework.stereotype.Component;

@Component("memberListSaveNewMember")
public class MemberListSaveNewMember implements Save {
    @Override
    public void save() {
        MemberPOJO memberPOJO = this.prepareMemberPOJO();
        MemberListSingle.getInstance().addListNewMember( memberPOJO );
        ListViewSingle.getInstance().getMemberList().getItems().add( memberPOJO.getName() + " " + memberPOJO.getSurName() );
    }
    private MemberPOJO prepareMemberPOJO(){
        MemberPOJO memberPOJO = new MemberPOJO();

        memberPOJO.setName( TextFieldSingle.getInstance().getSaveNameTxt().getText() );
        memberPOJO.setSurName( TextFieldSingle.getInstance().getSaveSurNameTxt().getText() );
        memberPOJO.setSalary( TextFieldSingle.getInstance().getSaveSalaryTxt().getText() );

        return memberPOJO;
    }
}
