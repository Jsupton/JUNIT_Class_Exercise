package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
  private NewTelephoneCompany ntc;
  
  @Before
  public void setUp() throws Exception {
    ntc = new NewTelephoneCompany();
  }
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case1() {
    ntc.setStartTime(-5);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case2() {
    ntc.setStartTime(-1);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case3() {
    ntc.setStartTime(2544);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case4() {
    ntc.setStartTime(2400);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case5() {
    ntc.setStartTime(2401);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case6() {
    ntc.setStartTime(1578);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case7() {
    ntc.setStartTime(1160);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case8() {
    ntc.setStartTime(1161);
    ntc.setDuration(10);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidStartTime_Case9() {
    ntc.setStartTime(799);
    ntc.setDuration(-5);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidDuration_Case1() {
    ntc.setStartTime(1800);
    ntc.setDuration(0);
    ntc.computeCharge();
  }
  
  @Test(expected=UnsupportedOperationException.class)
  public void testComputeCharge_InvalidDuration_Case2() {
    ntc.setStartTime(1801);
    ntc.setDuration(-1);
    ntc.computeCharge();
  }
  
  @Test
  public void testComputeCharge_BothDiscounts_Case1() {
    ntc.setStartTime(500);
    ntc.setDuration(100);
    double expResult = 1768.0 ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_BothDiscounts_Case2() {
    ntc.setStartTime(759);
    ntc.setDuration(61);
    double expResult = 1078.48 ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_BothDiscounts_Case3() {
    ntc.setStartTime(1959);
    ntc.setDuration(61);
    double expResult = 1078.48 ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_BothDiscounts_Case4() {
    ntc.setStartTime(2359);
    ntc.setDuration(65);
    double expResult = 1149.20 ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_StartTimeDiscount_Case1() {
    ntc.setStartTime(0);
    ntc.setDuration(60);
    double expResult = 1248.00;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_StartTimeDiscount_Case2() {
    ntc.setStartTime(400);
    ntc.setDuration(59);
    double expResult = 1227.20;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_StartTimeDiscount_Case3() {
    ntc.setStartTime(759);
    ntc.setDuration(1);
    double expResult = 20.80;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_StartTimeDiscount_Case4() {
    ntc.setStartTime(1800);
    ntc.setDuration(10);
    double expResult = 208.00;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_StartTimeDiscount_Case5() {
    ntc.setStartTime(1801);
    ntc.setDuration(10);
    double expResult = 208.00;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_StartTimeDiscount_Case6() {
    ntc.setStartTime(2359);
    ntc.setDuration(10);
    double expResult = 208.00;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_DurationDiscount_Case1() {
    ntc.setStartTime(800);
    ntc.setDuration(65);
    double expResult = 2298.40  ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  } 
  
  @Test
  public void testComputeCharge_DurationDiscount_case2() {
    ntc.setStartTime(900);
    ntc.setDuration(61);
    double expResult = 2156.96  ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  } 
  
  @Test
  public void testComputeCharge_NoDiscounts_Case1() {
    ntc.setStartTime(1000);
    ntc.setDuration(40);
    double expResult = 1664.00  ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_NoDiscounts_Case2() {
    ntc.setStartTime(800);
    ntc.setDuration(1);
    double expResult = 41.60  ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_NoDiscounts_Case3() {
    ntc.setStartTime(801);
    ntc.setDuration(59);
    double expResult = 2454.4  ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testComputeCharge_NoDiscounts_Case4() {
    ntc.setStartTime(1759);
    ntc.setDuration(60);
    double expResult = 2496.00  ;
    assertTrue("A call starting at " + ntc.getStartTime() + " for a duration of " + ntc.getDuration()+ expResult,expResult==ntc.computeCharge());
  }
  
  @Test
  public void testGetStartTime() {
    int expResult = 5;
    ntc.setStartTime(5);
    int result = ntc.getStartTime();
    assertEquals("Hours is " + expResult,expResult, result);
  }
  
  @Test
  public void testSetStartTime() {
    int expResult = 10;
    ntc.setStartTime(10);
    assertEquals("Hours is "+expResult,expResult,ntc.getStartTime());
  }
  
  @Test
  public void testGetDuration() {
    int expResult = 5;
    ntc.setDuration(5);
    int result = ntc.getDuration();
    assertEquals("Duration is " + expResult,expResult, result);
  }
  
  @Test
  public void testSetDuration() {
    int expResult = 10;
    ntc.setDuration(10);
    assertEquals("Duration is "+expResult,expResult,ntc.getDuration());
  }
  
}