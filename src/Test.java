public class Test {
    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920,1080);

        Monitor monitor = new Monitor("VS1970","ASUS","18.5" , resolution);

        Kasa kasa = new Kasa("Shadow Blade " , "Shadow", "Temperli Cam");

        Anakart anakart = new Anakart("B250","ASUS",10,"Windows10");

        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);

        pc.getKasa().bilgisayari_ac();

        pc.getMonitor().monitoru_kapat();

        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");

        // Inheritance --> Bir şirketin çalışanlarını yaparken kullabilirsininiz çünkü;
        // şirketteki herkes çalışandır ve herkesin ayrı ayrı özellikleri vardır/*

        // Composition --> Has - a ilişkisi var bilgisayar anakarta monitor'e sahiptir
        //*********************************************************************************
        // burda anakart kasa bilgisayar onlar tamamen kendi içinde birleşen olduğu için Composition kullanılır.//
        // örneğin bir araba tasarlıcaksanız motor,tekerlek gibi iç iç'e döngülerde kullanılır.
        // Buna da has-a ilişkisi denir .






    }
}
