import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FriendList list = new FriendList();
        List<String> list1 = Arrays.asList("Ryan", "Kieran", "Mark");
        List<String> list2 = Arrays.asList("Jimm", "Cari", "aret", "truehdnviegkwgvke", "sixtyiscooooool");
        System.out.println(list.friendList(list1));
        System.out.println(list.friendList(list2));

    }

}