import Models.AppUser;
import dao.AppUserDao;
import dao.impl.MySQLUserDAO;


public class TempTest {
    public static void main(String[] args) {
        AppUserDao dao = new MySQLUserDAO();
        AppUser user1 = AppUser.UserBuilder.getBuilder()
                .name("Mark")
                .lastName("1")
                .email("1@1")
                .password("aaa")
                .login("lol")
                .build();

        AppUser user2 = AppUser.UserBuilder.getBuilder()
                .name("Dark")
                .lastName("2")
                .email("2@2")
                .password("aaa2")
                .login("lol2")
                .build();

        AppUser user3 = AppUser.UserBuilder.getBuilder()
                .name("asdasd")
                .lastName("3")
                .email("3@3")
                .password("aaa3")
                .login("lol3")
                .build();

        dao.saveUser(user1);
        dao.saveUser(user2);
        dao.saveUser(user3);
        dao.fallow(user1, user2);
        System.out.println("Followed of user1");
        dao.getFallowedUsers(user1).forEach(System.out::println);
        System.out.println("Followers of user2");
        dao.getFallowers(user2).forEach(System.out::println);
        System.out.println("unfollowing user ---------------");
        dao.unfollow(user1, user2);
        System.out.println("Followed of user1");
        dao.getFallowedUsers(user1).forEach(System.out::println);
        System.out.println("Followers of user2");
        dao.getFallowers(user2).forEach(System.out::println);
        System.out.println(dao.getUserByEmail("2@2"));
    }
}