package fvat;

import org.junit.Assert;
import org.junit.Test;

public class PozycjaFakturyTest {

    @Test
    public void prototypeConstructorGetCenaNettoPoz(){
        Firma dpd = new Firma("DPD", "Gdansk", 55236367);
        Firma fedex = new Firma("FedEx", "Londyn", 5635345);
        PozycjaFaktury lp1 = new PozycjaFaktury("Maszynka", 1, 30.25, 23);
        PozycjaFaktury lp2 = new PozycjaFaktury("Osełka", 3, 25.25, 18);

        Assert.assertEquals(30.25, lp1.getCenaNettoPoz(), 0.01);
    }

    @Test
    public void prototypeConstructorGetCenaBrutto(){
        Firma dpd = new Firma("DPD", "Gdansk", 55236367);
        Firma fedex = new Firma("FedEx", "Londyn", 5635345);
        PozycjaFaktury lp1 = new PozycjaFaktury("Osełka", 3, 25.25, 18);

        Assert.assertEquals(89.38, lp1.getCenaBrutto(), 0.01);
    }
}
