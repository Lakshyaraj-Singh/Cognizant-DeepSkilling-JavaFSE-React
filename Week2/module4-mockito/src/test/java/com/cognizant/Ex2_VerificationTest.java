package com.cognizant;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class Ex2_VerificationTest{

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}