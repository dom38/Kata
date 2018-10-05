import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        StringBuilder builder = new StringBuilder();

        for (int s :binary) {

            builder.append(s);

        }

        int result = Integer.parseInt(builder.toString(), 2);
        return result;

    }

}
