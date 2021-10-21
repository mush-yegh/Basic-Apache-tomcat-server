import com.google.gson.Gson;
import user.User;

public class Main {
  public static void main(String[] args) {
    User user = new User("Bob", "Marley", 33);
    Gson g = new Gson();
    /*
     * in order to add gson.jar go to mvnrepository.com and download it, then go to Project Settings
     * -> Modules -> Dependencies -> "+" -> Jars or Directories -> select the downloaded file ->
     * Apply -> Ok, and it will appear in External Libraries
     */
    String userToJson = g.toJson(user);
    System.out.println(userToJson);

    User userFromJson = g.fromJson(userToJson, User.class);
    System.out.println(userFromJson);
  }
}
