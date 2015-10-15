/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcupapp;

/**
 *
 * @author Nathan Ryan x13448212 Group 7
 */
public class WCOddsGroupName extends WCOddsTeamName {

    private String TeamGroup;

    public WCOddsGroupName(String TeamName, String TeamGroup) {
        super(TeamName);
        this.TeamGroup = TeamGroup;
    }

    public String getTeamGroup() {
        return TeamGroup;
    }

    public void setTeamGroup(String TeamGroup) {
        this.TeamGroup = TeamGroup;
    }

}
