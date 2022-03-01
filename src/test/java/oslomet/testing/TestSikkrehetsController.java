package oslomet.testing;
/*
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.stereotype.Repository;
import oslomet.testing.DAL.BankRepository;

import java.util.HashMap;
import java.util.Map;

import static jdk.internal.vm.compiler.word.LocationIdentity.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestSikkrehetsController {
    @Mock
    private BankRepository repository;
    @Mock
    MockHttpSession session;

    @Before
    public void initSession(){
        Map<String,Object> attributes = new HashMap<String,Object>();

        doAnswer(new Answer<Object>(){
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                String key = (String) invocation.getArguments()[0];
                return attributes.get(key);
            }
        }).when(session).getAttribute(anyString());

        doAnswer(new Answer<Object>(){
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                String key = (String) invocation.getArguments()[0];
                Object value = invocation.getArguments()[1];
                attributes.put(key, value);
                return null;
            }
        }).when(session).setAttribute(anyString(), any());


    }

    @Test
    public void test_sjekklogginnit(){
        //arrange
        when(repository.sjekkLoggInn(anyString(), anyString())).thenReturn("Ok");
        // act
        String resultat = sikkrehetsControlle.sjekkLogginn( "23456789" , " 12345678");

        assertEquals( " ok", resultat);
    }


}
*/