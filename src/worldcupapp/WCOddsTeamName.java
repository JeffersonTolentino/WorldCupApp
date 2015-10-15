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
public class WCOddsTeamName {

    private String TeamName;

    public WCOddsTeamName() {
        TeamName = new String();
    }

    public WCOddsTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

}
