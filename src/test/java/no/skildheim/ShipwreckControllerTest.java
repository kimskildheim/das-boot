package no.skildheim;

import no.skildheim.controller.ShipwreckController;
import no.skildheim.model.Shipwreck;
import no.skildheim.repository.ShipwreckRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreck(){
        Shipwreck shipwreck = new Shipwreck();
        shipwreck.setId(1L);
        Mockito.when(shipwreckRepository.findOne(1L)).thenReturn(shipwreck);

        Shipwreck wreck = shipwreckController.get(1L);
        Mockito.verify(shipwreckRepository).findOne(1L);
        // Assert.assertEquals(1L, wreck.getId().longValue());
        MatcherAssert.assertThat(wreck.getId(), Matchers.is(1L));
    }

}
