public class Main {
    public static void main(String[] args) {

        EnumGezegen.Gezegen tempgezegen = EnumGezegen.Gezegen.MARS;

        System.out.println("Gezegenin Adı " + tempgezegen.name());
        System.out.println("Gezegenin Donme Suresi " + tempgezegen.getDonmeSuresi());
        System.out.println("Gezegenin Güneş'e Olan Sıralaması " + tempgezegen.getSıralamaNumarası());
        System.out.println("Gezegenin Güneş'e Olan Uzaklığı " + tempgezegen.getUzaklık());
        System.out.println("Gezegenin yarıçapı " + tempgezegen.getYarıcap());
    }


}