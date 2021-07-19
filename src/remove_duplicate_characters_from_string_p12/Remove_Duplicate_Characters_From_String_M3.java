package remove_duplicate_characters_from_string_p12;

public class Remove_Duplicate_Characters_From_String_M3 {
    public static void main(String[] args) {
        String stringWithDuplicates = "abcbafy";
        char[] ch = stringWithDuplicates.toCharArray();
        int length = ch.length;
        System.out.println("String with duplicates : " + stringWithDuplicates);
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (ch[i] == ch[j]) {
                    int temp = j;//set duplicate element index
                    //delete the duplicate element by shifting the elements to left
                    for (int k = temp; k < length - 1; k++) {
                        ch[k] = ch[k + 1];
                    }
                    j--;
                    length--;//reduce char array length
                }
            }
        }
        String stringWithOutDuplicates = new String(ch);
        stringWithOutDuplicates = stringWithOutDuplicates.substring(0, length);
        System.out.println("String after duplicates removed : " +
                stringWithOutDuplicates);
    }
}

