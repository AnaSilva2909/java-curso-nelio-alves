import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "995365262");

        cookies.remove("email");
        cookies.put("phone", "995325262");
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());
        System.out.println("All COOKIES: ");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));

        }
    }

}
