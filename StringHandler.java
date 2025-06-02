import java.util.List;

public class StringHandler {

    public String replaceText(String text, List<String> namesToReplace) {
        for (String name : namesToReplace) {
            text = text.replaceAll("\\b" + name + "\\b", "den studerende");
        }
        return text;
    }
}
