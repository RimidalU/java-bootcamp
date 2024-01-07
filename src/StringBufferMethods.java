public class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer stringBuffer16 = new StringBuffer(); // 16 signs
        StringBuffer stringBuffer53 = new StringBuffer(53); // 53 signs
        StringBuffer stringBuffer = new StringBuffer("stringBuffer text");

        System.out.println(stringBuffer.append(" + new text"));
        System.out.println(stringBuffer.insert(28, " + last from remove"));
        System.out.println(stringBuffer.delete(35, 50));
        System.out.println(stringBuffer.replace(20, 28, "replaced text"));
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.indexOf("last"));
        System.out.println(stringBuffer.charAt(11));
        System.out.println(stringBuffer.compareTo(stringBuffer53)); // '0' -equal; '-[number]' - a < b; '+[number]' - a>
                                                                    // b
        System.out.println(stringBuffer.reverse());

        stringBuffer.toString();

        // Strings methods:

        String string = new String("String");

        System.out.println(string.compareToIgnoreCase("string"));
        System.out.println(string.concat(" string2")); // "String" + " string2"

        System.out.println(string.equals("string"));
        System.out.println(string.equalsIgnoreCase("String"));

        char newString[] = new char[10];
        string.getChars(1, 5, newString, 0);
        System.out.println(newString);
        System.out.println("String".replace("rin", "RIN"));

        String splitString[] = "1string2string3string".split("ng");
        for (int i = 0; i < splitString.length; i++) {
            System.out.println(splitString[i]);
        }

        // string comparison

        // if two var created with out `new String` and have equal value they link are
        // equal

        // == - comparison on link
        // equals - comparison on value

        // substring
        String example = "Example String";
        String sunStr = example.substring(0, 8);
        System.out.println(sunStr);
        sunStr = example.substring(8);
        System.out.println(sunStr);

        System.out.println(example.toLowerCase());
        System.out.println(example.toUpperCase());

        example = "   Example String  ";
        System.out.println(example.trim());
    }
}
