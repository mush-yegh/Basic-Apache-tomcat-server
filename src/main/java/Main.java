import com.google.gson.Gson;

public class Main {
  public static void main(String[] args) {
    User user = new User("Bob", "Marley", 33);
    Gson g = new Gson();

    String userToJson = g.toJson(user);
    System.out.println(userToJson);

    User userFromJson = g.fromJson(userToJson, User.class);
    System.out.println(userFromJson);
  }
}
