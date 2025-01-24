 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_car1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author OZN cOxat
 */
public class clienti {
    Integer id;
    String nume;
    String prenume;
    String email;
    String dataretur;
    String numar_inmatriculare;
    String data_primire;
    Integer pret_plata;

    public void setPret_plata(Integer pret_plata) {
        this.pret_plata = pret_plata;
    }

    public void setData_primire(String data_primire) {
        this.data_primire = data_primire;
    }

    public Integer getPret_plata() {
        return pret_plata;
    }

    public String getData_primire() {
        return data_primire;
    }

    public clienti(Integer id, String nume, String prenume, String email, String dataretur, String numar_inmatriculare, String data_primire, Integer pret_plata) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.dataretur = dataretur;
        this.numar_inmatriculare = numar_inmatriculare;
        this.data_primire = data_primire;
        this.pret_plata = pret_plata;
    }

    public clienti() {
    }

    
   

    public String getDataretur() {
        return dataretur;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataretur(String dataretur) {
        this.dataretur = dataretur;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNumar_inmatriculare() {
        return numar_inmatriculare;
    }

    public void setNumar_inmatriculare(String numar_inmatriculare) {
        this.numar_inmatriculare = numar_inmatriculare;
    }

    public clienti(Integer id, String nume, String prenume, String email, String dataretur, String numar_inmatriculare) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.dataretur = dataretur;
        this.numar_inmatriculare = numar_inmatriculare;
    }
    
    public static boolean isValidEmail(String email) {
        final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        boolean isValid=matcher.matches();
        return isValid;
    }
    public static boolean isValidNri(String numar_inmatriculare) {
        final String REGISTRATION_NUMBER_REGEX = "^[A-Z]{2}\\d{2}[A-Z]{3}$";
        Pattern pattern = Pattern.compile(REGISTRATION_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(numar_inmatriculare);
        boolean isValid=matcher.matches();
        return isValid;
    }
    public static boolean isValidNume(String nume) {
        final String NUME_REGEX = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(NUME_REGEX);
        Matcher matcher = pattern.matcher(nume);
        boolean isValid=matcher.matches();
        return isValid;
    }
     public static boolean isValidPrenume(String Prenume) {
        final String PRENUME_REGEX = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(PRENUME_REGEX);
        Matcher matcher = pattern.matcher(Prenume);
        boolean isValid=matcher.matches();
        return isValid;
    }
    
    
    
    
    
    
}
