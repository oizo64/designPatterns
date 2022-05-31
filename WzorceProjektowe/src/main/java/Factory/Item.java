package Factory;

import java.util.HashMap;
import java.util.Map;
public abstract class Item {

    Map<String, String> templates = new HashMap<>();

    public Item(){
        initTemplates();
    }

    public void initTemplates() {
        templates.put("whoCreated", "<<Your login will appear here>>");
        templates.put("whenCreated", "<<Creation date here>>");
    }
    abstract void fillTemplates();

    public Map<String, String> getTemplates(){
        return templates;
    }

    public void putTemplateValue(String label, String value){
        templates.put(label,value);
    }
}
