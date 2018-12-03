import core.framework.search.ElasticSearchMigration;
import core.framework.util.ClasspathResources;

import java.io.IOException;

/**
 * @author neo
 */
public class Main {
    public static void main(String[] args) throws IOException {
        var migration = new ElasticSearchMigration("sys.properties");
        migration.migrate(search -> search.createIndex("product", ClasspathResources.text("product-index.json")));
    }
}
