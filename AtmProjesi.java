import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            userName = imp.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            password = imp.nextLine();
            if (userName.equals("patika") && (password.equals("java101"))){
                System.out.println("Giriş Başarılı");
                do {
                System.out.println("1- Para Çekme\n" +
                        "2- Para Yatırma\n" +
                        "3- Bakiye Sorgulama\n" +
                        "4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                select = imp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            int price = imp.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price = imp.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("Günce bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış Başarılı");
                            break;
                    }
                }while (select != 4);
                System.out.println("Hatalı işlem yaptınız");
                break;
            }else{
                --right;
                System.out.println("Kullanıcı Adı Veya Şİfre Hatalı");
                if (right == 0){
                    System.out.println("Hesanınız Bloke Olmuştur Tekrardan Açılması İçin En Yakın Şubemize Uğrayınız");
                }
                System.out.println("Kalan deneme hakkınız :  "+ right);
            }
        }
    }
}
