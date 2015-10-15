/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcupapp;

import java.io.Serializable;

/**
 *
 * @author Nathan Ryan x13448212 Group 7
 */
public class TeamSearch implements Serializable {

    private String Group;
    private String fix1;
    private String fix2;
    private String fix3;
    private String TeamInput;

    public TeamSearch() {

        Group = new String();
        fix1 = new String();
        fix2 = new String();
        fix3 = new String();
        TeamInput = new String();

    }

    public String getTeamInput() {
        return TeamInput;
    }

    public void setTeamInput(String TeamInput) {
        this.TeamInput = TeamInput;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getFix1() {
        return fix1;
    }

    public void setFix1(String fix1) {
        this.fix1 = fix1;
    }

    public String getFix2() {
        return fix2;
    }

    public void setFix2(String fix2) {
        this.fix2 = fix2;
    }

    public String getFix3() {
        return fix3;
    }

    public void setFix3(String fix3) {
        this.fix3 = fix3;
    }

}
