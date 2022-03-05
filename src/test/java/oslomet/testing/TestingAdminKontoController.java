package oslomet.testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import oslomet.testing.API.AdminKontoController;
import oslomet.testing.API.BankController;
import oslomet.testing.DAL.AdminRepository;
import oslomet.testing.DAL.BankRepository;
import oslomet.testing.Models.Konto;
import oslomet.testing.Models.Kunde;
import oslomet.testing.Sikkerhet.Sikkerhet;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestingAdminKontoController {
    @InjectMocks
    // denne skal testes
    private AdminKontoController AdminController;

    @Mock
    // denne skal Mock'es
    private AdminRepository repository;


    @Mock
    // denne skal Mock'es
    private Sikkerhet sjekk;


    @Test
    public void hentAlleKonti_LoggetInn()  {
        // arrange
        List<Konto> konti = new ArrayList<>();
        Konto konto1 = new Konto("105010123456", "01010110523",
                720, "Lønnskonto", "NOK", null);
        Konto konto2 = new Konto("105010123456", "12345678901",
                1000, "Lønnskonto", "NOK", null);
        konti.add(konto1);
        konti.add(konto2);

        when(sjekk.loggetInn()).thenReturn("01010110523");

        when(repository.hentAlleKonti()).thenReturn(konti);

        // act
        List<Konto> resultat =AdminController.hentAlleKonti();

        // assert
        assertEquals(konti, resultat);
    }

    @Test
    public void hentAlleKonti_IkkeLoggetInn()  {
        // arrange

        when(sjekk.loggetInn()).thenReturn(null);

        // act
        List<Konto> resultat = AdminController.hentAlleKonti();

        // assert
        assertNull(resultat);
    }
    @Test
    public void test_endrkontoOK() {

        List<Konto> konti = new ArrayList<>();
        Konto konto1 = new Konto("105010123456", "01010110523",
                720, "Lønnskonto", "NOK", null);
        // check if konto1 is inserted
        // update konto1

        // konto1.setSaldo(8000);
        // konto1 = konto2

        // check if the konto1 is konto2



        Konto konto2 = new Konto("105010123456", "01010110524",
                800, "Lønnskonto", "NOK", null);



        //when(repository.endreKonto(any(Konto .class))).thenReturn("Ikke innlogget");

        String restulat = AdminController.endreKonto(konto1);
        assertEquals("Ikke innlogget", restulat);
    }

    @Test
    public void test_endreKontoFeil() {

        Konto konto1 = new Konto();

        String restulat = AdminController.endreKonto(konto1);
      assertEquals("Ikke innlogget", restulat);
    }

    @Test
    public void test_slettKonto () {

        String resultat = AdminController.slettKonto("1");
       assertEquals("Ikke innlogget", resultat);
    }

    @Test
    public void test_slettKontoFeil() {

        //Mockito.when(repository.slettKonto(anyString())).thenReturn("Ikke innlogget");

        String resultat = AdminController.slettKonto("1");
        Assert.assertEquals("Ikke innlogget", resultat);
    }



}

