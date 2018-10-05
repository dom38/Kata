public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.length() == 0) return null;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {

            if (phrase.charAt(i) == ' ') {

                builder.append(phrase.charAt(i));
                char character = Character.toUpperCase(phrase.charAt(i+1));
                builder.append(character);
                i++;

            } else if (i == 0) {

                char character = Character.toUpperCase(phrase.charAt(i));
                builder.append(character);

            } else {

                builder.append(phrase.charAt(i));

            }

        }

        return builder.toString();
    }
}
