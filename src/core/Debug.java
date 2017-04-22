package core;

/**
 * Created by zva on 22/04/17.
 */
public class Debug {

    public static void print(Object message) {
        StringBuilder sb = new StringBuilder();
        sb.append("core.Debug: ");
        sb.append(message.toString());
        System.out.println(sb.toString());
    }
}
