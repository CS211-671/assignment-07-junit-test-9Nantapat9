package ku.cs.models;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        UserList Users = new UserList();
        // TODO: add 3 users to UserList
        Users.addUser("Dramelon","12345678");
        Users.addUser("Camera","12344678");
        Users.addUser("SomeMelon","12344444");
        // TODO: find one of them
        User Dramelon = Users.findUserByUsername("Dramelon");
        // TODO: assert that UserList found User
        assertEquals("Dramelon",Dramelon.getUsername());
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        UserList Users = new UserList();
        // TODO: add 3 users to UserList
        Users.addUser("Dramelon","12345678");
        Users.addUser("Camera","12344678");
        Users.addUser("SomeMelon","12344444");
        // TODO: change password of one user
        Users.findUserByUsername("Dramelon").setPassword("2222");
        // TODO: assert that user can change password
        assertTrue(Users.changePassword("Camera","12344678","1234"));
        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        UserList Users = new UserList();
        // TODO: add 3 users to UserList
        Users.addUser("Dramelon","12345678");
        Users.addUser("Camera","12344678");
        Users.addUser("SomeMelon","12344444");
        // TODO: call login() with correct username and password
        User Camera = Users.login("Camera","12344678");
        // TODO: assert that User object is found
        assertEquals(Users.findUserByUsername("Camera"),Camera);
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        UserList Users = new UserList();
        // TODO: add 3 users to UserList
        Users.addUser("Dramelon","12345678");
        Users.addUser("Camera","12344678");
        Users.addUser("SomeMelon","12344444");
        // TODO: call login() with incorrect username or incorrect password
        User Camera = Users.login("Camera","12344448");
        // assertEquals(expected, actual);
        // TODO: assert that the method return null
        assertNull(Camera);
        // assertNull(actual);
    }



}