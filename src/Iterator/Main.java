package Iterator;

public class Main {
    public static void main(String []args){
        Users users = new Users();

        users.create(new User("John", 20));
        users.create(new User("Mike", 23));
        users.create(new User("Karl", 25));
        users.create(new User("Jason", 30));

        while (users.hasMore()){
            User user = users.next();
            System.out.println("User is: " + user.getName());
        }
    }
}
