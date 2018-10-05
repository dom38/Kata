public class Switcheroo {

    public String switcher (String swap) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < swap.length(); i++) {

            if (swap.charAt(i) == 'a') builder.append('b');
            else if (swap.charAt(i) == 'b') builder.append('a');
            else builder.append(swap.charAt(i));

        }

        return builder.toString();

    }

}
