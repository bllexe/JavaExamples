package org.example.StringExam.spacesControl;

public class SpaceRemove {

    public static void main(String[] args) {

        String str="calcu l at e";
        System.out.println(removeSpace(str));
    }

    private static String removeSpace(String str) {

        StringBuilder sBuilder=new StringBuilder();
        char [] charArray=str.toCharArray();
        for (char c :charArray){
            if (!Character.isWhitespace(c)){
                sBuilder.append(c);
            }
        }
        return sBuilder.toString();
    }
}
