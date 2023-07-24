package Test;

public class Methods extends MainTest {
    private static String session = "https://api.vk.com/method/";
    private static String token = "VKtoken";
    private static String version = "v=5.131";

    public static String buildRequest(String method, String user, String parapms) {
        return (session + method + "?" + "owner_id=" + user + "&" + parapms + "&" + token + "&" + version);
    }


}
