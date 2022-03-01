package oslomet.testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import oslomet.testing.API.AdminKontoController;
import oslomet.testing.DAL.AdminRepository;
import oslomet.testing.Sikkerhet.Sikkerhet;

@RunWith(MockitoJUnitRunner.class)
public class TestingAdminKundeController {
    @InjectMocks
    private AdminKontoController AdminController;

    @Mock
    // denne skal Mock'es
    private AdminRepository repository;


    @Mock
    // denne skal Mock'es
    private Sikkerhet sjekk;

    @Test
    public void hentAlle() {

    }


    @Test
    public void registrer() {

    }

    @Test
    public void endre() {

    }

    @Test
    public void slett() {

    }
    //hent alle

    //lage
    //endre
    //slett
    //
}
