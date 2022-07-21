package Command;

public class Database {
    private static Database instance;
    public String sql;
    private Database(){

    }
    public static Database getInstance(){
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }
    public void query(String sql){
        this.sql = sql;
    }
}
class Aplication{
    public static void main(String[] args){
        Database foo = Database.getInstance();
        foo.query("SELECT");
        System.out.println(foo.sql);
        Database bar = Database.getInstance();
        bar.query("hola");
        System.out.println(bar.sql);
    }
}
