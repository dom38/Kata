import java.util.ArrayList;
import java.util.List;

public class FriendList {

    public List<String> friendList (List<String> list) {

        List<String> newList = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() == 4) newList.add(list.get(i));

        }

        return newList;

    }

}
