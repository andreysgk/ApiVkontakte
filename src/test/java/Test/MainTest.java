package Test;

import Pojo.Friends;
import Pojo.Wall;
import Pojo.MessageResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import static io.restassured.RestAssured.given;

public class MainTest {
    @Test
    public void getFriends(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecification200());
         List<Friends> friendsList = given()
                 .when()
                 .get(Methods.buildRequest("friends.get","105548092","fields=bdate"))
                 .then().log().all()
                 .extract().body().jsonPath().getList("response.items", Friends.class);
        Assertions.assertEquals(76,friendsList.size());
    }
    @Test
    public void getWall(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecification200());
        List<Wall> wall = given()
                .when()
                .get(Methods.buildRequest("wall.get","158900303","count=5&filter=owner"))
                .then().log().all()
                .extract().body().jsonPath().getList("response.items", Wall.class);
        Assertions.assertEquals("My name is Dmitry I'm from Russia", wall.get(3).getText());
    }

    @Test
    public void postWall(){
        Specifications.installSpecification(Specifications.requestSpecification(), Specifications.responseSpecification200());
        MessageResponse message = given()
                .when()
                .post(Methods.buildRequest("wall.post","105548092","from_group=0&message=t.me/h_or_h"))
                .then().log().all()
                .extract().jsonPath().getObject("response", MessageResponse.class);
        Assertions.assertNotNull(MessageResponse.class);
    }
}

