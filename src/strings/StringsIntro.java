package strings;

public class StringsIntro {
    public static void main(String[] args) {
        String name = "Ajaz";    //initislisation by literals (string pool area

        String anotherName = new String("Ajaz");
        //no string pool area (heap area) atleast 1 and can be 2 copies
        //immutable
        //==object reference
        //equals char reference
        //trim saces omit
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.substring(2));
        System.out.println(name.substring(0,2));
        System.out.println(name.contains("Aj-------"));
        System.out.println(name.isEmpty());
        System.out.println(name.concat(" " + anotherName));
//        System.out.println(name.indexOf("z"));
        System.out.println(name.replace("z","y"));
        String cars = "Hyundai,Maruti,Suzuki,Wagonr,Ferarri";
        System.out.println(cars.indexOf('-'));
        String allCars[] = cars.split(",");
        for(String car: allCars){
            System.out.print(car + "  ");
        }


    }
}
