package com.clProject.step_definitions;

import com.clProject.utilities.DBUtils;
import io.cucumber.java.en.Given;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Map;

public class DBConnectionStepDef {
    @Given("User connected to DB")
    public void userConnectedToDB() {
        int teamID = 11267;
        String sql = "SELECT * FROM team WHERE id = " + teamID;
        Map<String, Object> dbNewTeamMap = DBUtils.getRowMap(sql);
        System.out.println("sql = " + sql);
        System.out.println("dbNewTeamMap = " + dbNewTeamMap);

        assertThat(dbNewTeamMap.get("id"),equalTo((long)teamID));
//        assertThat(dbNewTeamMap.get("name"),equalTo("registeredName"));/* registeredName comes from REST ASSURED API */



    }
}
