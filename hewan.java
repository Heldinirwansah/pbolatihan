package PBO;

public class hewan {
        String mata, mulut, telinga, kaki, ekor;

        public void setMata(String mata) {
            this.mata = mata;
        }

        public void setMulut(String mulut) {
            this.mulut = mulut;
        }

        public void setTelinga(String telinga) {
            this.telinga = telinga;
        }

        public void setKaki(String kaki) {
            this.kaki = kaki;
        }

        public void setEkor(String ekor) {
            this.ekor = ekor;
        }

        public String getMata() {
            return mata;
        }

        public String getMulut() {
            return mulut;
        }

        public String getTelinga() {
            return telinga;
        }

        public String getKaki() {
            return kaki;
        }

        public String getEkor() {
            return ekor;
        }

        void bermain(String main) {
            System.out.println("Ayo bermain " + main);
        }

        void makan(String food) {
            System.out.println("Aku mau makan " + food + " dong");
        }

        void tidur() {
            System.out.println("Aku ingin tidur. Jangan ganggu!");
        }
    }

