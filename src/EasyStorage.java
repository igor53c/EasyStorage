import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class EasyStorage{
    private Map<String, String> itemRepositoryMap;

    public EasyStorage(){
        itemRepositoryMap = new HashMap<>();
    }
    public void store(String item, String repository){
        if (item == null || repository == null) {
            throw new NullPointerException("Item and repository cannot be null");
        }
        if (item.trim().isEmpty() || repository.trim().isEmpty()) {
            throw new IllegalArgumentException("Item and repository cannot be empty");
        }
        itemRepositoryMap.put(item, repository);
    }

    public Map<String, String> getAllData(){
        return itemRepositoryMap;
    }

    public String getRepository(String item){
        return itemRepositoryMap.get(item);
    }

    public Set<String> getItems(String repository){
        Set<String> items = new HashSet<>();
        for (Map.Entry<String, String> entry : itemRepositoryMap.entrySet()) {
            if (entry.getValue().equals(repository)) {
                items.add(entry.getKey());
            }
        }
        return items;
    }
}
