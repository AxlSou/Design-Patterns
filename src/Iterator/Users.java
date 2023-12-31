package Iterator;

import java.util.ArrayList;

public class Users implements UserIterator{
    private ArrayList<User> users = new ArrayList();
    private int index = 0;

    public void create(User user){
        users.add(user);
    }

    @Override
    public User next() {
        User user = this.users.get(index);
        index = index + 1;
        return user;
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public boolean hasMore() {
        return index < users.size();
    }
}
