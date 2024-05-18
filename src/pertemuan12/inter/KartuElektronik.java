package pertemuan12.inter;

public class KartuElektronik implements Kartu{
    private String kodeBank, pin;

    public KartuElektronik(String kodeBank, String pin){
        super();
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    @Override
    public boolean otetinkasi(String pinInput) {
        return pin.equals(pinInput);
    }

    @Override
    public String encode(String pin) {
        // melakukan enkripsi inputan PIN
        return null;
    }
}
