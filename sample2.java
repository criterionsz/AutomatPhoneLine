@Test
public void TestCase1() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.onHook(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.onHook(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.onHook(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.onHook(),"INVALID OUTPUT");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"INVALID OUTPUT");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"INVALID OUTPUT");
}

@Test
public void TestCase2() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase3() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase4() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase5() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase6() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"continues");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"continues");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"continues");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"continues");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"continues");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"continues");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"continues");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"continues");
}

@Test
public void TestCase7() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase8() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase9() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase10() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.onHook(),"disconnectedLine");
}

@Test
public void TestCase11() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"slowBusyTone");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"slowBusyTone");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"slowBusyTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"slowBusyTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"slowBusyTone");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"slowBusyTone");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"slowBusyTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"slowBusyTone");
}

@Test
public void TestCase12() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.offHook(),"INVALID OUTPUT");
}

@Test
public void TestCase13() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"PlayMessage");
}

@Test
public void TestCase14() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"PlayMessage");
}

@Test
public void TestCase15() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"PlayMessage");
}

@Test
public void TestCase16() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.invalidNumber(),"slowBusyTone");
}

@Test
public void TestCase17() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
}

@Test
public void TestCase18() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(101); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
}

@Test
public void TestCase19() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(201); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"findConnection");
}

@Test
public void TestCase20() {
try {Thread.sleep(1); } catch (Exception ex) {}
assertEquals(pl.offHook(),"soundDialTone");
try {Thread.sleep(301); } catch (Exception ex) {}
assertEquals(pl.validNumber(),"slowBusyTone");
}

