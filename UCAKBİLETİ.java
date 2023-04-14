import java.util.Scanner;
public class UCAKBİLETİ {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int yas,km,secim;
        double fiyat;
        System.out.println("Bilet uygulamasına hoşgeldiniz.");
        System.out.println("Mesafeyi km cinsinden giriniz");
        km=inp.nextInt();
        if(km<1){
            System.out.println("Km 1 den küçük olamaz lütfen yeniden başlatın.");
        }
        System.out.println("Yaşınızı giriniz");
        yas= inp.nextInt();
        if(yas<0){
            System.out.println("Yaş 0 dan küçük olamaz lütfen yeniden başlatın.");
        }
        System.out.println("Yolculuk seçimi yapınız");
        System.out.println("/1- Sadece Gidiş - /2- Gidiş-Dönüş");
        secim= inp.nextInt();
        switch (secim){
            case 1:
                fiyat=km*0.10;
                if(yas<12){
                    fiyat=fiyat/2;
                    System.out.println("Fiyat:"+fiyat+" tl");
                }
                else if(yas>=12 && yas<=24){
                    fiyat=fiyat-(fiyat*0.10);
                    System.out.println("Fiyat: "+fiyat+" tl");
                }
                else if(yas>=65){
                    fiyat=fiyat-(fiyat*0.30);
                    System.out.println("Fiyat: "+fiyat+" tl");
                }
            case 2:
                fiyat=km*0.10;
                if(yas<12){
                    fiyat=fiyat/2;
                    fiyat=fiyat-(fiyat*0.20);
                    System.out.println("Fiyat:"+fiyat+" tl");
                }
                else if(yas>=12 && yas<=24){
                    fiyat=fiyat-(fiyat*0.10);
                    fiyat=fiyat-(fiyat*0.20);
                    System.out.println("Fiyat: "+fiyat+" tl");
                }
                else if(yas>=65){
                    fiyat=fiyat-(fiyat*0.30);
                    fiyat=fiyat-(fiyat*0.20);
                    System.out.println("Fiyat: "+fiyat+" tl");
                }
            default:System.out.println("hatalı seçim girdiniz lütfen yeniden başlatın!");
        }
    }
}
