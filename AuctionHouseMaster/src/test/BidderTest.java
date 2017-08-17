package test;

import model.Bidder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BidderTest {

    private static double DELTA = 0.05;

    private Bidder bidder;

    @Before
    public void setUp() {
        bidder = new Bidder("Paul Carter", 300.00);
    }

    @Test
    public void testGetters() {
        assertEquals(bidder.getName(), "Paul Carter");
        assertEquals(bidder.getCurrentBid(), 0, DELTA);
        assertEquals(bidder.getMaxBid(), 300.00, DELTA);
        assertEquals(bidder.getPersonalBid(), 0.00, DELTA);
    }




}