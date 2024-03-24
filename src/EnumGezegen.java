public class EnumGezegen {

    //sıralama hariç diğer bilgiler doğru değil :)
    public enum Gezegen {
        MERKUR(1, 5.5, 0.38, 88),
        VENUS(2, 6.7, 0.95, 25),
        DUNYA(3, 7, 1, 36),
        MARS(4, 7.8, 0.53, 67),
        JUPITER(5, 8.2, 11.2, 433),
        SATURN(6, 13, 9.45, 105),
        URANUS(7, 29.22, 4, 368),
        NEPTUN(8, 44.05, 3.88, 600);

        private final int sıralamaNumarası;
        private final double uzaklık;
        private final double yarıcap;
        private final int donmeSuresi;

        Gezegen(int sıralamaNumarası, double uzaklık, double yarıcap, int donmeSuresi) {
            this.sıralamaNumarası = sıralamaNumarası;
            this.uzaklık = uzaklık;
            this.yarıcap = yarıcap;
            this.donmeSuresi = donmeSuresi;
        }

        public int getSıralamaNumarası() {
            return sıralamaNumarası;
        }

        public double getUzaklık() {
            return uzaklık;
        }

        public double getYarıcap() {
            return yarıcap;
        }

        public int getDonmeSuresi() {
            return donmeSuresi;
        }
    }

}
