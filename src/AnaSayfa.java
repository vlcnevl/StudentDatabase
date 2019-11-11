import java.io.IOException;
import java.util.Scanner;

public class AnaSayfa {

    public static void hatamesajı(int control)
    {
        if (control==0)
        {
            System.out.print("Girilen Id 'de ders bulunamadi.\n");
        }
    }

    public static void listele(Ogrenci []ogrenciler)
    {
        int i = 0 ,j = 0 ,k=0;
        System.out.println("---Öğrenciler---");
        for (i=0; i< ogrenciler.length;i++)
        {
            System.out.println((i+1)+".Öğrenci " +ogrenciler[i].getOgrNo() + " " + ogrenciler[i].getOgrAd() +" "+ogrenciler[i].getOgrSoyad() + " "+ogrenciler[i].getOgrBolum());

            System.out.println("---Dersler---");

            for (j = 0; j <ogrenciler[i].getDersler().length;j++ )
            {
                System.out.println((j+1)+ ".Ders" +ogrenciler[i].getDersler()[j].getDersId()+ " " +ogrenciler[i].getDersler()[j].getDersAd() + " " +ogrenciler[i].getDersler()[j].getDersKredi()+ " "+ ogrenciler[i].getDersler()[j].getDersDonem());
            }

            System.out.println("---Sınavlar---");

            for (k=0; k< ogrenciler[i].getSınavlar().length;k++)
            {
                System.out.println((k+1)+".Sınav" + +ogrenciler[i].getSınavlar()[k].getSinavId() +" " +ogrenciler[i].getSınavlar()[k].getDersId() + " "+ogrenciler[i].getSınavlar()[k].getSinavTarih() );
            }
        }
    }

    public static void AdArama(Ogrenci []ogrenciler)
    {
        String aranacak;
        Scanner sc =new Scanner(System.in);
        System.out.println("Aranacak İsim :");
        aranacak =sc.next();

        for (int i = 0 ; i < ogrenciler.length;i++)
        {
            if (ogrenciler[i].getOgrAd().equals(aranacak))
            {
                System.out.println((i+1)+".Öğrenci " +ogrenciler[i].getOgrNo() + " " + ogrenciler[i].getOgrAd() +" "+ogrenciler[i].getOgrSoyad() + " "+ogrenciler[i].getOgrBolum());
                System.out.println("---Dersler---");

                for (int j = 0; j <ogrenciler[i].getDersler().length;j++ )
                {
                    System.out.println((j+1)+ ".Ders " +ogrenciler[i].getDersler()[j].getDersId()+ " " +ogrenciler[i].getDersler()[j].getDersAd() + " " +ogrenciler[i].getDersler()[j].getDersKredi()+ " "+ ogrenciler[i].getDersler()[j].getDersDonem());
                }

                System.out.println("---Sınavlar---");

                for (int k=0; k< ogrenciler[i].getSınavlar().length;k++)
                {
                    System.out.println((k+1)+".Sınav " + +ogrenciler[i].getSınavlar()[k].getSinavId() +" " +ogrenciler[i].getSınavlar()[k].getDersId() + " "+ogrenciler[i].getSınavlar()[k].getSinavTarih() );
                }
            }
            else
            {
                System.out.println("Girilen İsimde Öğrenci Bulunamdi.");
            }
        }
    }

    public static void DersArama(Ogrenci []ogrenciler)
    {
        String aranacak;
        Scanner sc =new Scanner(System.in);
        System.out.println("Aranacak Ders :");
        aranacak =sc.next();

        for (int i = 0 ; i < ogrenciler.length;i++)
        {
            for (int j=0; j< ogrenciler[i].getDersler().length;j++)
            {
                if (ogrenciler[i].getDersler()[j].getDersAd().equals(aranacak))
                {
                    System.out.print(ogrenciler[i].getOgrNo() + " " +ogrenciler[i].getOgrAd() + " " + ogrenciler[i].getOgrSoyad() + " " +ogrenciler[i].getOgrBolum() +" ");
                    break;
                }
                else
                {
                    System.out.println("Girilen İsimde Ders Bulunamdi.");
                }
            }
        }
    }

    public static void menu(Ogrenci []ogrenciler)
    {
        Scanner sc =new Scanner(System.in);

        while (true)
        {
            int secim;
            System.out.print("1 -- > Tüm Bilgileri Listele \n2 -- > Öğrenci Adına Göre Arama \n3 -- > Ders Adına Göre Arama \n4 -- > Çıkış ");
            secim=sc.nextInt();
            switch (secim)
            {
                case 1 : listele(ogrenciler); break;
                case 2 : AdArama(ogrenciler); break;
                case 3 : DersArama(ogrenciler); break;
                case 4 : System.exit(0); break;
                default:
                    System.out.println("Yanlış Seçim Yapıldı .");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int ogrSay,dersSayi,sınavSayi=0;
        System.out.print("Kaç Tane Öğrenci Girilecek :");
        ogrSay = scan.nextInt();

        Ogrenci []ogrenciler = new Ogrenci[ogrSay];

        for (int i = 0 ; i< ogrSay;i++)
        {
            ogrenciler[i]= new Ogrenci();
            System.out.println((i+1)+".Öğrencinin");
            System.out.print("Öğrencinin Numarası : ");
            ogrenciler[i].setOgrNo(scan.nextLong());
            System.out.print("Öğrencinin Adı :");
            ogrenciler[i].setOgrAd(scan.next());
            System.out.print("Öğrencinin Soyadı :");
            ogrenciler[i].setOgrSoyad(scan.next());
            System.out.print("Öğrencinin Bölümü :");
            ogrenciler[i].setOgrBolum(scan.next());

            System.out.print("Öğrenci Kaç Ders Alacak :");
            dersSayi=scan.nextInt();

            Ders []dersler = new Ders[dersSayi];

            for(int j =0 ; j <dersSayi;j++ )
            {
                dersler[j] = new Ders();
                System.out.println((j+1)+".Dersin");
                System.out.print("Ders Id :");
                dersler[j].setDersId(scan.next());
                System.out.print("Ders Adı :");
                dersler[j].setDersAd(scan.next());
                System.out.print("Ders Kredi :");
                dersler[j].setDersKredi(scan.nextInt());
                System.out.print("Ders Dönem : ");
                dersler[j].setDersDonem(scan.nextInt());
            }
            ogrenciler[i].setDersler(dersler);
            int kontrol=0;
            while (kontrol==0)
            {
                System.out.print("Öğrencinin Kaç Sınavı Olacak :");
                sınavSayi=scan.nextInt();
                if (sınavSayi > dersSayi || sınavSayi < 0)
                {
                    System.out.print("Girilebilecek Sınav Sayısı En Fazla :"+ dersSayi+"\n");
                }
                else
                {
                    kontrol++;
                }
            }

            Sinav []sinavlar = new Sinav[sınavSayi];

            String temp ;

            for (int l = 0 ; l< sınavSayi; l++)
            {
                sinavlar[l] = new Sinav();
                kontrol=0;
                while (kontrol==0)
                {
                    int control=0;
                    System.out.print("Sınav Girilecek Ders Id :");
                    temp = scan.next();
                    for (int k = 0 ; k< dersSayi; k++) {
                        if (temp.equals(dersler[k].getDersId()))
                        {
                            sinavlar[l].setDersId(temp);
                            System.out.print("Sınav Id :");
                            sinavlar[l].setSinavId(scan.nextInt());
                            System.out.print("Sınav Tarihi :");
                            sinavlar[l].setSinavTarih(scan.next());
                            ogrenciler[i].setSınavlar(sinavlar);
                            kontrol++;
                            control=1;
                            break;
                        }

                    }
                    hatamesajı(control);

                }
            }

        }
        menu(ogrenciler);
    }

}