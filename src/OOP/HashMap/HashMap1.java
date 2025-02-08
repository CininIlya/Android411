package OOP.HashMap;


import java.util.HashMap;
import java.util.Map;


public class HashMap1 {
    public static void main(String[] args) throws Exception {
        String[] colors = new String[]{"red", "orange", "aqua", "pink",
                "gray ", "blue ", "white ", "black ", "yellow ", "brown "};

        HashMap<String, Color> map = addColorsToMap(colors);
        for (Map.Entry<String, Color> pair : map.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }

    public static HashMap<String, Color> addColorsToMap(String[] colors) {


        HashMap<String, Color> color1 = new HashMap<>();

//        color1.put("1) red", new Color("RED"));
//        color1.put("3)", new Color("ORANGE"));


        for (String str : colors) {

            color1.put(str, new Color(str));


        }
        return color1;
    }

    public static class Color {
        String name;

        public Color(String name) {


            this.name = name;
        }


        //        @Override
//        public String toString() {
//            return ""
//                    + name
//                    ;
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

//
//
//        map1.put("orange: ","ORANGE");
//        map1.put("aqua: ","AQUA");
//        map1.put("pink: ","PINK");
//        map1.put("gray: ","GRAY");
//        map1.put("blue: ","BLUE");
//        map1.put("white: ","WHITE");
//        map1.put("black: ","BLACK");
//        map1.put("yellow: ","YELLOW");
//        map1.put("brown: ","BROWN");
//        System.out.println(map1);



